public class TypeCheckAndCastApp {
    // demo using instanceof keyword
    public static void main(String[] args) {
        greetings(new VicePresident("nazar"));
        greetings(new Manager("nazar"));
        greetings(new Employee("nazar"));
    }

    // sample using instanceof type check and cast
    static void greetings(Employee employee){
        if(employee instanceof VicePresident){  //  -> type check
            VicePresident vp = (VicePresident) employee;     // -> type cast
            System.out.println("Hello VP " + vp.name);
        } else if (employee instanceof Manager) //  -> type check
        {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
