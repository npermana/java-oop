package nazar.oop.application;

import nazar.oop.data.City;
import nazar.oop.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // demo abstract class
        // abstract class is a contract
//        Location location = new Location(); // -> error, abstract class cannot be instantiated
        City city = new City();
        city.name = "jakarta";

        System.out.println(city.name);
    }
}
