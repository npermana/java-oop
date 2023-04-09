package nazar.oop.application;

import nazar.oop.data.Customer;
import nazar.oop.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        System.out.println("Demo Enum Class, dan Enum Members");
        Customer customer = new Customer();
        customer.setName("Nazar");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("print all level");
        for(Level l : Level.values()){
            System.out.println(l);
        }
    }
}
