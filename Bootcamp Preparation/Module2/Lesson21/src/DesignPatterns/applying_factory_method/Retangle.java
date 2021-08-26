package exercise.applying_factory_method;

public class Retangle implements Shape{
    private float height = 5;
    private float width = 2.5f;

    @Override
    public String draw() {
        return "" + (this.height + this.width)*2 + " " + this.width*this.width + " " + color;
    }
}
