package Manager;

import java.util.Scanner;

public class Main {

    // LỖI ĐỌC VÀ GHI FILE BAN ĐẦU!
    // NHƯNG KHI THỰC HIỆN CHỨC NĂNG THÊM 1 SINH VIÊN THÌ HẾT LỖI.
    // PHÁT TRIỂN BÀI NÀY THÀNH 1 CASE STUDY MODULE 2! (THÊM GIỚI TÍNH,ĐỊA CHỈ,TÌNH TRẠNG SỨC KHỎE,NGÀY SINH,...)
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentID;
        Menu();
        while (true){
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
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void Menu(){
        System.out.println("MENU");
        System.out.println("1. Show student list.");
        System.out.println("2. Add student.");
        System.out.println("3. Edit student. ");
        System.out.println("4. Delete student.");
        System.out.println("5. Enter student's score.");
        System.out.println("6. Edit student's score.");
        System.out.println("7. Sort student list.");
        System.out.println("0. Exit.");
        System.out.println("Enter your choice!");
    }
}
