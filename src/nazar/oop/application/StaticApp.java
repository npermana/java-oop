package nazar.oop.application;

import nazar.oop.data.Application;
import static nazar.oop.data.Constant.*;
import nazar.oop.data.Country;
import nazar.oop.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println("Demo static keyword");
        System.out.println(APPLICATION);    // -> using static import
        System.out.println(VERSION);        // -> using static import

        System.out.println(MathUtil.sum(1,1,1,1,1));
        Country.City city = new Country.City();
        city.setName("Jakarta");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
