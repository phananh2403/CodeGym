package com.company;

import java.util.Scanner;

public class Main {
    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            //bé hơn 20
            current = numNames[number % 100];
            number /= 100;
        } else {
            //lớn hơn hoặc bằng 20
            // hàng đơn vị - nếu là 2 chữ số
            // hàng chục - nếu là 3 chữ số
            current = numNames[number % 10];
            number /= 10;

            // hàng chục - nếu là 2 chữ số
            // hàng trăm - nếu là 3 chữ số
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }

    public String convert(int number) {
        if (number == 0) {
            return "zero";
        }
        String prefix = "";
        if (number < 0) {//check số âm
            number = -number;
        }
        String current = "";
        do {
            String s = convertLessThanOneThousand(number);
            current = s +  current;
            number /= 1000;
        } while (number > 0);
        return (prefix + current).trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        System.out.println(obj.convert(num));

    }
}
