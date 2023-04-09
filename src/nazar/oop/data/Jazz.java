package nazar.oop.data;

public class Jazz implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Jazz");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Honda";
    }
}
