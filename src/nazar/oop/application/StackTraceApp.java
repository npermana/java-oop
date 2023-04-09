package nazar.oop.application;

public class StackTraceApp {
    public static void main(String[] args) {
        System.out.println("Demo Stacktrace exception");
//        try {
//            String[] names = {"nazar", "sidik", "permana"};
//            System.out.println(names[4]);
//
//        }catch (Throwable throwable){
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//            throwable.printStackTrace();
//        }

        try{
            sampleError();
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public static void sampleError(){
        try {
            String[] names = {"nazar", "sidik", "permana"};
            System.out.println(names[4]);

        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
