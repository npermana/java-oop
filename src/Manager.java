class Manager extends Employee{
//    String name;
    String company;

    Manager(){
        // default constructor
        super(null);
    }

    // demo Super Constructor
    Manager(String name){
//        this.name = name;
//         child class should execute this super constructor
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void greetings(String name){
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}
