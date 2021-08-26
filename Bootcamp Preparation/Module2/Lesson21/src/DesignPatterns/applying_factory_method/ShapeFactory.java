package exercise.applying_factory_method;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        } else if("square".equals(type)){
            return new Square();
        }else {
            return new Retangle();
        }
    }
}
