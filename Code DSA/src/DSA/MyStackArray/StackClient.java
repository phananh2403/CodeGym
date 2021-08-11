package DSA.MyStackArray;

import java.util.Arrays;
import java.util.Scanner;

public class StackClient {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push("abc");
        stack.push("xyz");
        stack.push("mno");
        System.out.println("Is Stack Empty:" + stack.isEmpty());
        stack.printStack();
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println("Is Stack Full:" + stack.isFull());
    }
}
