package Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1();
        System.out.println(triangle);

        triangle = new Triangle1(3,4,5);
        System.out.println(triangle);

        triangle = new Triangle1(6,7,8,"red",true);
        System.out.println(triangle);
    }
}
