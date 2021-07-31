package AccessModifier;

public class Circle {

    public double radius = 1.0;
    public String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

}
