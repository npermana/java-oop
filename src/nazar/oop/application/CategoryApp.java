package nazar.oop.application;

import nazar.oop.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        System.out.println("Demo Encapsulation (setter getter)");
        Category category = new Category();
        category.setId("id");
        category.setExpensive(false);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
