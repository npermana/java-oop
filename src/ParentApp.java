public class ParentApp {
    public static void main(String[] args) {
        System.out.println("Demo Variable Hiding parent and child");
        Child child = new Child();
        child.name = "nazar";
        child.execute();

        System.out.println(child.name);

        Parent parent = child;
        parent.execute();                   // -> will access the method of child class. overriding class will be accessed
        System.out.println(parent.name);    // -> will access the variable name at parent class. no variable overriding in java
    }
}
