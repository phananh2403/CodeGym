package Point;

public class Point2D {
    private float x = 0.0f, y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] f = new float[2];
        f[0] = x;
        f[1] = y;
        return f;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
