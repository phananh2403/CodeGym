package PointAndMoveablePoint;

public class MoveableTest {
    public static void main(String[] args) {
        MoveablePoint mv = new MoveablePoint(1,2,3,4);
        System.out.println(mv);
        mv.move();
        System.out.println(mv);
    }
}
