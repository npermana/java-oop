package nazar.oop.application;

import nazar.oop.data.Product;

public class ToStringApp {
    public static void main(String[] args) {
        System.out.println("meng-override toString() method untuk mempresentasikan object lebih jelas");
        Product product = new Product("Macbook Pro", 20000000);
        System.out.println(product.toString());
    }
}
