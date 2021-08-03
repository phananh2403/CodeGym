package Triangle;

import KeThua.Shape;

public class Triangle1 extends Shape {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle1() {
    }

    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle1(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        return Math.sqrt(getPerimeter() / 2
                * (getPerimeter() / 2 - side1)
                * (getPerimeter() / 2 - side2)
                * (getPerimeter() / 2 - side3));
    }

    @Override
    public String toString() {
        return "A triangle with " + getSide1() + ","
                + getSide2() + " and " + getSide3()
                + " have Area = " + getArea()
                + " and Perimeter = " + getPerimeter()
                + ",which is a subclass of " + super.toString();
    }

}
