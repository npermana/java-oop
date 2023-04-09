public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Shape");
        Shape shape = new Shape();
        System.out.println(shape.getCorner());

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getShapeCorner());
    }
}
