package CircleCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(4,5);
        System.out.println(cylinder);

        cylinder = new Cylinder(4,5,"blue",true);
        System.out.println(cylinder);
    }
}
