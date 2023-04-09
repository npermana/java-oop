package nazar.oop.application;

import nazar.oop.data.LoginRequest;
import nazar.oop.error.ValidationException;
import nazar.oop.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("nazar", "test");

//         demo checked exception
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException e){
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Data Null: " + e.getMessage());
        } finally {
            System.out.println("Eksekusi berhasil");
        }

        // demo runtime/unchecked exception
        // tidak perlu try-catch
        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("sukses");
    }
}
