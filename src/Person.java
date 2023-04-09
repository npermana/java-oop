class Person {
    // add new field or properties or attribute
    String name;
    String address;
    final String country = "Indonesia";

    // add a method
    void greetings(String paramName){
//        System.out.println("Hello " + paramName + ", My name is " + name);
        // using this to avoid variable shadowing
        System.out.println("Hello " + paramName + ", My name is " + this.name);
    }

    //add a constructor
//    Person(String paramName, String paramAddress){
//        name = paramName;
//        address = paramAddress;
//    }

    // using 'this' keyword to avoid variable shadowing
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    // constructor overriding
    Person(String paramName){
        this(paramName, null);
    }
    // constructor overriding
    Person(){

    }
}
