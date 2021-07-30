package PTB2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
        if (ptb2.getDiscriminant() >= 0) {
            System.out.println("Root 1 is: " + ptb2.getRoot1() + "\n");
            System.out.println("Root 2 is: " + ptb2.getRoot2());
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.println("The equation has 1 root!");
        } else
            System.out.println("The equation has no roots!");
    }
}
