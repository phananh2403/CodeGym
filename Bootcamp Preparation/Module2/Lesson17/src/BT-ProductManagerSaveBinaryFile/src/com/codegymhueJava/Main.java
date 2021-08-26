package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static Scanner sc = new Scanner(System.in);
    static Check check = new Check();
    static List<Products> products = new ArrayList<Products>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int selection;
        while (true) {
            menu();
            System.out.println("select: ");

            selection = check.checkInteger(0,4);
            switch (selection) {
                case 0 :
                    System.exit(0);
                case 1 :
                    addProduct();
                    break;
                case 2 :
                    printProduct();
                    break;
                case 3 :
                    savaFile();
                    break;
                case 4 :
                    readFileProduct();
                    break;
            }
        }
    }

    private static void readFileProduct() throws IOException, ClassNotFoundException {
        List<Products> productsFromFile = new ArrayList<Products>();
        FileInputStream file = new FileInputStream("productList.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(file);
        productsFromFile = (List<Products>) objectInputStream.readObject();
        objectInputStream.close();
        file.close();
        for(Products product : productsFromFile) {
            System.out.println(product);
        }



    }

    private static void savaFile() throws IOException {
        FileOutputStream file = new FileOutputStream("productList.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
        file.close();
    }

    private static void printProduct() {
        menuDisplay();
        for(Products o : products) {
            System.out.println(o);
        }

    }

    private static void addProduct() {
        System.out.print("Product ID: ");
        String code = check.checkString();

        System.out.print("name: ");
        String name = check.checkString();

        System.out.print("By: ");
        String madeBy = check.checkString();

        System.out.print("Price: ");
        int price = check.checkInteger(0,100000000);

        System.out.println("Info: ");
        String info = check.checkString();

        products.add(new Products(code,name,madeBy,price,info));


    }

    public static void menu() {
        System.err.println("|||||||||||||||||||||||||||||||");
        System.err.println("||         MENU              ||");
        System.err.println("||     1.add Product         ||");
        System.err.println("||     2.Print Product       ||");
        System.err.println("||     3.Save File           ||");
        System.err.println("||     4.Display File        ||");
        System.err.println("||     0.Exit                ||");
        System.err.println("|||||||||||||||||||||||||||||||");
    }

    public static void menuDisplay() {
        System.out.println("\t" + "ID" + "\t\t" + "Name" + "\t\t" + "Made By" + "\t\t" + "price" + "\t\t" + "info");
    }
}
