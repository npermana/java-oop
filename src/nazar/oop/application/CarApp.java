package nazar.oop.application;

import nazar.oop.data.Car;
import nazar.oop.data.Jazz;

public class CarApp {
    public static void main(String[] args) {
        System.out.println("Demo interface (abstraction) and interface inheritance");
        Car jazz = new Jazz();
        jazz.drive();
        System.out.println(jazz.getTire());
        System.out.println(jazz.getBrand());    //  -> demo interface inheritance
        System.out.println(jazz.isBigCar());    // -> demo default method of interface
    }
}
