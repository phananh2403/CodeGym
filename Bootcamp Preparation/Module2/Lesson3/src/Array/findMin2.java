package Array;

import java.util.Scanner;

public class findMin2 {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang: ");
        n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhap cac phan tu mang: ");
        for (i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ":");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println("Min la: " + min);
    }
}
