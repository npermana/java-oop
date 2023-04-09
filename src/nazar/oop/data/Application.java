package nazar.oop.data;

public class Application {
    public static final int PROCESSOR;

    static {    //-> static keyword for static block
        System.out.println("Mengakses class application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
