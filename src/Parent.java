class Parent {
    String name;    // variable hiding, same variable name with child
    void execute(){
        System.out.println("execute in parent");
    }
}

class Child extends Parent{
    String name;    // variable hiding, same variable name with Parent
    void execute(){
        System.out.println("execute in child");
        System.out.println("parent name is " + super.name); // to access parent name variable
    }
}
