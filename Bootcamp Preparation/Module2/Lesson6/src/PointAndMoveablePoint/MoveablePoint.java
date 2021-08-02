package PointAndMoveablePoint;

public class MoveablePoint extends Point {
    float xSpeed = 0.0f, ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] f = new float[2];
        f[0] = xSpeed;
        f[1] = ySpeed;
        return f;
    }
    @Override
    public String toString(){
        return super.toString()
                + "," + "speed = (" + getxSpeed()
                + "," + getySpeed() + ")";

    }
    public void move(){
        super.setXY(super.getX()+ xSpeed, super.getY() + ySpeed);
    }
}
