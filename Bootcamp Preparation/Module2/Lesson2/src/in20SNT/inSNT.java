package in20SNT;

import java.util.Scanner;

public class inSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in: ");
        int num = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < num) {
            if (check(i)) {
                System.out.println(i + "");
                count++;
            }
            i++;
        }

    }

    private static boolean check(int n) {
        int i = 2;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

