package ViDu;

import java.util.Scanner;

public class tienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Tien vay ngan hang: ");
        money = input.nextDouble();
        System.out.println("So thang vay: ");
        month = input.nextInt();
        System.out.println("Lai suat/nam: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tong tien lai thu duoc: " + totalInterest);
    }
}
