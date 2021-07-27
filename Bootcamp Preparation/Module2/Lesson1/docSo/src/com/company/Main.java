package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num;
        num = scanner.nextInt();

        if (num > 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("Out of ability");
                    break;
            }
        }
        if (10 <= num && num <= 20) {
            switch (num) {
                case 10:
                    System.out.print("Ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelfth");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 20:
                    System.out.print("Twenty");
                    break;
                default:
                    System.out.print(num % 10 + "teen");
                    break;
            }
        }
        if (20<num && num<100){
            switch (num){
                case 21:
                    System.out.print("Twenty one");
                    break;

            }
        }
    }
}
