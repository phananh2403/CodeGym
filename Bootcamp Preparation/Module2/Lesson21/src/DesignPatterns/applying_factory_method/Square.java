package exercise.applying_factory_method;

public class Square implements Shape{
    private float side = 4.5f;
    @Override
    public String draw() {
        return "" + this.side*2 + " " + Math.pow(this.side,2) + " " + color;
    }
}
