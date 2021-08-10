package StackQueue.DecToBin;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int decimalNumber = 123456789;
        System.out.print("Hệ nhị phân của " + decimalNumber + " là :");
        new Test().convertBinary(decimalNumber);
    }

    public void convertBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0) {
            //thực hiện phép chia lấy phần dư cho 2.
            int d = num % 2;
            // thêm vào stack.
            stack.push(d);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
