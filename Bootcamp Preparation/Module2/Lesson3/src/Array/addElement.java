package Array;

import java.util.Scanner;

public class addElement {
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

        System.out.println("Nhap gia tri can them: ");
        int value = scanner.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        int index = scanner.nextInt();
        n++;
        for (i = n - 1; i >= index; i--) {
             array[i + 1] = array[i];
        }
        array[index] = value;

        System.out.println("Mang sau khi them: ");
        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }


}
