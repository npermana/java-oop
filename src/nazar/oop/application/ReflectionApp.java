package nazar.oop.application;

import nazar.oop.data.CreateUserRequest;
import nazar.oop.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        System.out.println("Java demo Reflection");
        System.out.println("Pengecheckan tidak menggunakan if-else tapi menggunakan annotation dan reflection");
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("nazar");
        request.setPassword("password");
        ValidationUtil.validationReflection(request);
    }
}
