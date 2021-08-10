package StackQueue.reverse;

import java.util.Arrays;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        String s = "Sample";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.empty()) {   //Xét trường  hợp stack không rỗng
            sb.append(stack.pop());//Nối ký các ký tự lấy từ stack vào sb
        }
        return sb.toString();
    }
}

