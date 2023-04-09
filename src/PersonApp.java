public class PersonApp {
    public static void main(String[] args) {
        // How to create an object of a class
//        Person person1 = new Person();
//        Person person2 = new Person();


        Person person1 = new Person("nazar");   // demo constructore overriding
        Person person2 = new Person("permana", "jakarta");
        Person person3 = new Person(); //default constructor
        // adding value to a field
        person1.name = "nazar";
        person1.address = "jakarta";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // execute a method
        person1.greetings("sidik");
    }
}
