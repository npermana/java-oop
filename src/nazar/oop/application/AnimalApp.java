package nazar.oop.application;

import nazar.oop.annotation.Fancy;
import nazar.oop.data.Animal;
import nazar.oop.data.Cat;
@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        System.out.println("Demo Abstract Method");

        Animal animal = new Cat();
        animal.name = "Opas";
        animal.run();
    }
}
