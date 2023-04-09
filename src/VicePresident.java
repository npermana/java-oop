class VicePresident extends Manager{

    // implement super constructor of parent class
    VicePresident(String name) {
        super(name);    // access to Parent constructor (super constructor)
    }

    // method overriding, declare a same method from parent class
    @Override
    void greetings(String name){
        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }
}
