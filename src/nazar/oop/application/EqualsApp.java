package nazar.oop.application;

public class EqualsApp {
    public static void main(String[] args) {
        System.out.println("Demo using object comparison vs ==");
        String first = "nazar";
        first = first + " " + "sidik";
        System.out.println(first);

        String second = "nazar sidik";
        System.out.println(second);

        System.out.println(first == second);    // print false because of object comparison, different object each.
        System.out.println(first.equals(second));   // print true, using equals for object comparison

        String third = "nazar sidik";
        System.out.println(second == third);    // print true because of same object comparison
        System.out.println(second.equals(third));   // print true, using equals for object comparison
     }
}
