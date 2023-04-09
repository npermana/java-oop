class PolymorphismApp {
    // Employee <-- Manager <-- VicePresident

    public static void main(String[] args) {

        System.out.println("Polymorphism");
        // Polymorphism, declare employee for Employee
        Employee employee = new Employee("nazar");
        employee.greetings("permana");  // access greetings of Employee class

        // Polymorphism, declare employee for Manager
        employee = new Manager("nazar");
        employee.greetings("permana");  // access greetings of Manager class

        // Polymorphism, declare employee for VP
        employee = new VicePresident("nazar");
        employee.greetings("permana");  // access greetings of VicePresident class

        // another polymorphism sample
        greetings(new Employee("nazar"));
        greetings(new Manager("sidik"));
        greetings(new VicePresident("permana"));
    }

    // Polymorhpism, create a function for all type Employee
    static void greetings(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
