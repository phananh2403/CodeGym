package com.codegymhueJava;

import java.util.Scanner;

public class Check {

    static Scanner scanner = new Scanner(System.in);
    public int checkInteger (int min, int max) {
        int num = 0;
        while (true){
            try {
                num = Integer.parseInt(scanner.nextLine());
                if(num >= min && num <= max) {
                    break;
                }else{
                    System.out.println("Select again within " + min + " - " + max);
                }
            }catch (Exception e) {
                System.err.println("Data Tyle is Integer. Please Try Again");
            }
        }

        return num;
    }

    public static String checkString() {
       String str = "";
       try {
           while (str == "") {
               str = scanner.nextLine();

           }


       }catch (Exception e) {
           System.out.println("không để trống..");
       }
       return str;

    }



}
