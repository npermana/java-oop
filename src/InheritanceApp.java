class InheritanceApp {
    public static void main(String[] args) {
        // Parent class
        Manager manager = new Manager(null);
        manager.name = "nazar";
        manager.greetings("sidik");

        // child class inherit from parent class
        VicePresident vp = new VicePresident(null);
        vp.name = "sidik";
        vp.greetings("nazar");
    }
}
