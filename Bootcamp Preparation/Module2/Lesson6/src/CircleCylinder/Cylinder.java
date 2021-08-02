package CircleCylinder;

public class Cylinder extends Circle {
    private double radius0 = 4.0;
    private double height0 = 9.0;

    public Cylinder() {
    }

    public Cylinder(double radius0, double height0) {
        this.radius0 = radius0;
        this.height0 = height0;
    }

    public Cylinder(double radius, double height0, String color, boolean filled) {
        super(radius, color, filled);
        this.height0 = height0;
    }

    public double getRadius0() {
        return radius0;
    }

    public void setRadius0(double radius0) {
        this.radius0 = radius0;
    }

    public double getHeight0() {
        return height0;
    }

    public void setHeight0(double height0) {
        this.height0 = height0;
    }

    public double getArea() {
        return radius0 * radius0 * Math.PI * height0;
    }
    @Override
    public String toString(){
        return "A cylinder with height = "+getHeight0()
                + ",which is a subclass of " + super.toString();
    }
}
