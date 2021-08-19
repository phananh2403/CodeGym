package StudentList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "V? Ki?u Anh", "Hà N?i"));
        students.add(new Student(2, "Nguy?n Minh Quân", "Hà N?i"));
        students.add(new Student(3, "??ng Huy Hoà", "?à N?ng"));
        students.add(new Student(4, "Nguy?n Khánh Tùng", "Hà N?i"));
        students.add(new Student(5, "Nguy?n Kh?c Nh?t", "Hà N?i"));
        writeToFile("D:\\CodeGym\\CodeGym\\Bootcamp Preparation\\Module2\\Lesson17\\src\\StudentList\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("D:\\CodeGym\\CodeGym\\Bootcamp Preparation\\Module2\\Lesson17\\src\\StudentList\\student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
