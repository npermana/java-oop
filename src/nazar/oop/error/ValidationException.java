package nazar.oop.error;

public class ValidationException extends Throwable{
    public ValidationException(String message){
        super(message); // kirim data message ke Throwable
    }
}
