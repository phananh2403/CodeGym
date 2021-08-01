package Array;

import java.util.Scanner;

public class CountCharOnString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = sc.nextLine();

        System.out.println("Enter a Char: ");
        char c = 'a';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
        }

        System.out.println("Count is: " + count);
    }
}
