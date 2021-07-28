package ViDu;

import java.util.Scanner;

public class menu2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve hinh chu nhat");
            System.out.println("2. Ve tam giac vuong");
            System.out.println("3. Ve tam giac vuong nguoc");
            System.out.println("4. Ve tam giac can");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ve hinh chu nhat!");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Ve tam giac");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Ve tam giac vuong nguoc");
                    for (int i = 7; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Ve tam giac can");
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= 7 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}
