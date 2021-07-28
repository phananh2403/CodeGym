package Array;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class deleteElement {
    public static void main(String[] args) {
        int n, j, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang: ");
        n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhap cac phan tu mang: ");
        for (i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhap gia tri can xoa: ");
        int value = scanner.nextInt();
        for (i = 0; i < n; i++) {
            if (array[i] == value) {
                System.out.println(value + " co trong mang va la phan tu o vi tri " + i);
                //array.remove(value);
                //sử dụng remove() của thư viện ArrayList
            }
        }
        //duyệt mảng,nếu phần tử nào != với giá trị cần xóa thì thêm vào mảng mới
        //không có phần tử cần xóa được nhập vào từ bàn phím.
        for (j = i = 0; i < n; i++) {
            if (array[i] != value) {
                array[j] = array[i];
                j++;
            }
        }
        n = j;
        System.out.println("Mang moi sau khi xoa " + value + ":");
        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
