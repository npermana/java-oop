package nazar.oop.application;

import nazar.oop.data.Greetings;

public class GreetingsApp {
    public static void main(String[] args) {
        System.out.println("Demo Anonymous class");

        Greetings english = new Greetings() {
            @Override
            public void greetings() {
                System.out.println("Good Morning");
            }

            @Override
            public void greetings(String name) {
                System.out.println("Good Morning, " + name);
            }
        };

        Greetings indonesian = new Greetings() {
            @Override
            public void greetings() {
                System.out.println("Selamat Pagi");
            }

            @Override
            public void greetings(String name) {
                System.out.println("Selamat Pagi, " + name);
            }
        };

        english.greetings();
        english.greetings("nazar");

        indonesian.greetings();
        indonesian.greetings("nazar");
    }
}
