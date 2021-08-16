package Debug.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)//(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) --> là 1 tam giác
            throw new IllegalTriangleException("Not a triangle.");
        else
            System.out.println("Is a triangle");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter value of side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter value of side3: ");
        double side3 = scanner.nextDouble();
        try {
            if (side1 <= 0 || side2 <= 0 || side3 <= 0 ){
                System.out.println("Wrong side's value!");
            }
            Triangle obj = new Triangle(side1,side2,side3);
        } catch (Exception m) {
            System.out.println("Exception occurred: " + m);//Ngoại lệ xảy ra
        }
    }
}

class IllegalTriangleException extends Exception {//lớp ngoại lệ kế thừa lớp Exception

    IllegalTriangleException(String s) {
        super(s);
    }
}
