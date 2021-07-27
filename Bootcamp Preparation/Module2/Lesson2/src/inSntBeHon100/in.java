package inSntBeHon100;

import java.util.Scanner;

public class in {
    //in ra các số nguyên tố bé hơn 1 num nhập từ bàn phím
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int num = scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (check(i)) {
                System.out.println(i + "");
            }
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
