package StackQueue.PalindromeString;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckString2 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Queue queue = new LinkedList();
        //duyệt chuỗi (cuối -> đầu)
        for (int i = str.length() - 1; i >= 0; i++) {
            queue.add(str.charAt(i));//thêm các chữ vừa duyệt từ chuỗi vào hàng đợi
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if(str.equals(reverseString)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not Palindrome String");
        }
    }
}
