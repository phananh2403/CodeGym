package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao USD");
        int dollar = scanner.nextInt();
        int vnd = rate * dollar;
        System.out.println(dollar + " = " + vnd + "vnd");
    }
}
