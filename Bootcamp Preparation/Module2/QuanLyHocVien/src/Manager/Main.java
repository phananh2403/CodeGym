package Manager;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // LỖI ĐỌC VÀ GHI FILE BAN ĐẦU!
    // NHƯNG KHI THỰC HIỆN CHỨC NĂNG THÊM 1 SINH VIÊN THÌ HẾT LỖI.
    // PHÁT TRIỂN BÀI NÀY THÀNH 1 CASE STUDY MODULE 2! (THÊM GIỚI TÍNH,ĐỊA CHỈ,TÌNH TRẠNG SỨC KHỎE,NGÀY SINH,...)
    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentID;

        while (true){
            Menu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    studentManager.showStudent();
                    break;
                case 2:
                    studentManager.add();
                    break;
                case 3:
                    studentID = studentManager.inputID();
                    studentManager.edit(studentID);
                    break;
                case 4:
                    studentID = studentManager.inputID();
                    studentManager.delete(studentID);
                    break;
                case 5:
                case 6:
                    studentID = studentManager.inputID();
                    studentManager.editScore(studentID);
                    break;
                case 7:
                    studentManager.sortStudent();
                    break;
                case 8:
                    showData();
                    break;
                case 9:
                    fileInformation();
                    break;
                case 0:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }


    }
    public static  void fileInformation(){
        File myObj = new File("D:\\CodeGym\\CodeGym\\Bootcamp Preparation\\Module2\\QuanLyHocVien\\student.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
    public static void showData() throws Exception {
        try {
            FileInputStream readData = new FileInputStream(new File("D:\\CodeGym\\CodeGym\\Bootcamp Preparation\\Module2\\QuanLyHocVien\\student.txt"));
            ObjectInputStream readStream = new ObjectInputStream(readData);
            ArrayList<Student> studentArrayList = (ArrayList<Student>) readStream.readObject();
            readStream.close();
            System.out.println(Arrays.toString(studentArrayList.toArray()));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



//        File file = new File("student.txt");
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        String st;
//        while ((st = br.readLine()) != null){
//            System.out.println(Arrays.toString(st.split(" ")));
//        }


    }
    public static void Menu(){
        System.out.println("-------------STUDENT LIST-------------");
        System.out.println("|      1. Show student list.         |");
        System.out.println("|      2. Add student.               |");
        System.out.println("|      3. Edit student.              |");
        System.out.println("|      4. Delete student.            |");
        System.out.println("|      5. Enter student's score.     |");
        System.out.println("|      6. Edit student's score.      |");
        System.out.println("|      7. Sort student list.         |");
        System.out.println("|      8. Show student data.         |");
        System.out.println("|      9. Show file's information.   |");
        System.out.println("|      0. Exit.                      |");
        System.out.println("|      Please enter your choice!     |");
        System.out.println("--------------------------------------");
        System.out.print("Your choice: ");
    }
}
