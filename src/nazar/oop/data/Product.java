package nazar.oop.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;

    // public constructor
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product name is " + this.name + ", Price is " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
