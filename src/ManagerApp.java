public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("nazar");
        manager.greetings("permana");

        VicePresident vp = new VicePresident("permana");
        vp.greetings("nazar");

        System.out.println(manager);    // -> print object information, conversion of object 'manager' to String -> className@hashcode
        System.out.println(vp);         // -> print object information, conversion of object 'vp' to String -> className@hashcode

    }
}
