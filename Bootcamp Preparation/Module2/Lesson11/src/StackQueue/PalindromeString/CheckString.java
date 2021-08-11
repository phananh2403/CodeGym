package StackQueue.PalindromeString;

import java.util.Scanner;
import java.util.Stack;

public class CheckString {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack stack = new Stack();
        //duyệt chuỗi (đầu -> cuối)
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        //tạo chuỗi trống
        //Cộng chuỗi trống vào các phần tử lấy ra từ stack = pop()
        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString = reverseString+stack.pop();
        }
        //so sánh chuỗi mới với chuỗi gốc
        if(str.equals(reverseString)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not Palindrome String");
        }
    }
}
