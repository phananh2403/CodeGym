package exercise.applying_factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape a1 = shapeFactory.getShape("feline");
        System.out.println("a1 : " + a1.draw());

        Shape a2 = shapeFactory.getShape("circle");
        System.out.println("a2 : " + a2.draw());

        Shape a3 = shapeFactory.getShape("square");
        System.out.println("a3 : " + a3.draw());
    }
}
