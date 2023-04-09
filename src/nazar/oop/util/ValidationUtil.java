package nazar.oop.util;

import nazar.oop.annotation.NotBlank;
import nazar.oop.data.LoginRequest;
import nazar.oop.error.BlankException;
import nazar.oop.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    // demo checked exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username() == null)
            throw new NullPointerException("Username tidak boleh null");
        if(loginRequest.username().isBlank())
            throw new ValidationException("Username tidak boleh kosong");
        if(loginRequest.password() == null)
            throw new NullPointerException("Password tidak boleh null");
        if(loginRequest.password().isBlank())
            throw new ValidationException("Password tidak boleh kosong");
    }

    // demo unchecked exception/runtime exception
    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null)
            throw new NullPointerException("Username tidak boleh null");
        if(loginRequest.username().isBlank())
            throw new BlankException("Username tidak boleh kosong");
        if(loginRequest.password() == null)
            throw new NullPointerException("Password tidak boleh null");
        if(loginRequest.password().isBlank())
            throw new BlankException("Password tidak boleh kosong");
    }

    public static void validationReflection(Object object) {
        Field[] fields = object.getClass().getDeclaredFields(); // untuk dapatkan semua field (public, protect, private)

        for(Field field : fields){
            field.setAccessible(true);  // memaksa semua field yg protected dan private agar bisa diakses
            if(field.getAnnotation(NotBlank.class) != null){
                try {
                    String value = (String) field.get(object);
                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }

    }
}
