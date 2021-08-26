package exercise.applying_factory_method;

public class Circle implements Shape{
    private float radius = 4.5f;

    @Override
    public String draw() {
        return "" + this.radius*2*Math.PI + " " + Math.PI*Math.pow(this.radius,2) + " " + this.color;
    }
}
