package com.company;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Kiem tra so nguyen to
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if(number<2){
            System.out.println(number + "ko la SNT");
        }else {
            int i=2;
            boolean check=true;
            while(i<=Math.sqrt(number)){
                if (number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number+" la SNT");
            else
                System.out.println(number+" ko la SNT");
        }
    }
}
