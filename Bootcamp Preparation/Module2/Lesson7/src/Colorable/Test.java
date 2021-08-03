package Colorable;

public class Test {
    public static void main(String[] args) {
        Square s1 = new Square(true, 5);
        System.out.println(s1);
        s1.howToColor();

        s1 = new Square(10);
        System.out.println(s1);
        s1.howToColor();

        s1 = new Square();
        System.out.println(s1);
        s1.howToColor();
    }
}
