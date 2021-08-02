package CircleCylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.6);
        System.out.println(circle);

        circle = new Circle(5.6,"blue",true);
        System.out.println(circle);
    }
}
