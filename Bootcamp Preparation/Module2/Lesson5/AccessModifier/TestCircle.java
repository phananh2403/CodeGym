package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius of circle is: " + circle.getRadius());
        System.out.println("Area of circle is: " + circle.getArea());
    }
}
