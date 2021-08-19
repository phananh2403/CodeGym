package Manager;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private StudentData studentData;

    //đọc file data
    public StudentManager() {
        studentData = new StudentData();
        studentList = studentData.read();
    }

    //xem DS
    public void showStudent() {
        System.out.println("Student ID  |  Name  |  1st score  |  2nd score  |  3rd score  |  4th score  |  Average score");
        for (Student student : studentList) {

            System.out.println("    " + student.getId() + "           " + student.getName() + "           " + student.getFirst_() + "           "
                    + student.getSecond_() + "           " + student.getThird_() + "           "
                    + student.getFourth_() + "           " + student.getDtb_());

//            System.out.println("\nStudent's name: " + student.getName());
//            System.out.println("\nStudent's first score: " + student.getFirst_());
//            System.out.println("\nStudent's second score: " + student.getSecond_());
//            System.out.println("\nStudent's third score: " + student.getThird_());
//            System.out.println("\nStudent's fourth score: " + student.getFourth_());
//            System.out.println("\nStudent's average score: " + student.getDtb_());

            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    }

    //Thêm
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("Student's ID = " + id);
        String name = inputName();
//        try {
//            Integer.parseInt(name);
//            System.out.println("Name is number");
//        } catch (Exception e){
//            System.out.println("Name is string");
//        }

        //Kiểm tra đầu vào của tên sinh viên.
//        Pattern pattern = Pattern.compile("\\d*");
//        Matcher matcher = pattern.matcher(name);
//        if (matcher.matches()) {
//            System.out.println("Name Is a Number");
//        } else {
//            System.out.println("Name Not a Number");
//        }

        float firstScore = inputFirst();
        float secondScore = inputSecond();
        float thirdScore = inputThird();
        float fourthScore = inputFourth();
        Student student = new Student(id, name, firstScore, secondScore, thirdScore, fourthScore);
        studentList.add(student);
        studentData.write(studentList);
    }

    //editor
    public void edit(int id) {
        boolean isExist = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExist = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setFirst_(inputFirst());
                studentList.get(i).setSecond_(inputSecond());
                studentList.get(i).setThird_(inputThird());
                studentList.get(i).setFourth_(inputFourth());
                break;
            }
        }
        if (!isExist) {
            System.out.println("Student not existed");
        } else {
            studentData.write(studentList);
        }
    }


    //Edit score = Enter student score if student never have scores before.
    public void editScore(int id) {
        boolean isExist = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExist = true;
                studentList.get(i).setFirst_(inputFirst());
                studentList.get(i).setSecond_(inputSecond());
                studentList.get(i).setThird_(inputThird());
                studentList.get(i).setFourth_(inputFourth());
                break;
            }
        }
        if (!isExist) {
            System.out.println("Student not existed");
        } else {
            studentData.write(studentList);
        }
    }

    //xoa
    public void delete(int id) {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            studentData.write(studentList);//Update data
        } else {
            System.out.println("Student not existed");
        }
    }

    public void sortStudent() {
        studentList.sort(new SortStudent());
    }

    public void showStudentList() {
        System.out.println(studentList.toString());
    }

    public int inputID() {
        System.out.println("Enter Student's ID: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.println("Enter Student's ID again!");
            }
        }
    }

    public String inputName() {
        System.out.println("Enter Student's Name: ");
        //Kiểm tra đầu vào của tên sinh viên.
        while (true){
            try {
                String name = scanner.nextLine();
                Pattern pattern = Pattern.compile("[^a-z0-9 ]\\d*",Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(name);
                boolean alert = matcher.find();
                if (matcher.matches()){
                    throw new Exception();
                }
                if(alert)
                    throw new Exception();
                return name;
            } catch (Exception e){
                System.out.println("There is a special character in Student's name,please enter again!");
            }
        }
    }

    public float inputFirst() {
        System.out.println("Enter Student's first score: ");
        while (true) {
            try {
                float first = Float.parseFloat((scanner.nextLine()));
                if (first < 0.0 && first > 10.0) {
                    throw new NumberFormatException();
                }
                return first;
            } catch (NumberFormatException ex) {
                System.out.println("Enter Student's first score again!");
            }
        }
    }

    public float inputSecond() {
        System.out.println("Enter Student's second score: ");
        while (true) {
            try {
                float second = Float.parseFloat((scanner.nextLine()));
                if (second < 0.0 && second > 10.0) {
                    throw new NumberFormatException();
                }
                return second;
            } catch (NumberFormatException ex) {
                System.out.println("Enter Student's second score again!");
            }
        }
    }

    public float inputThird() {
        System.out.println("Enter Student's third score: ");
        while (true) {
            try {
                float third = Float.parseFloat((scanner.nextLine()));
                if (third < 0.0 && third > 10.0) {
                    throw new NumberFormatException();
                }
                return third;
            } catch (NumberFormatException ex) {
                System.out.println("Enter Student's third score again!");
            }
        }
    }

    public float inputFourth() {
        System.out.println("Enter Student's fourth score: ");
        while (true) {
            try {
                float fourth = Float.parseFloat((scanner.nextLine()));
                if (fourth < 0.0 && fourth > 10.0) {
                    throw new NumberFormatException();
                }
                return fourth;
            } catch (NumberFormatException ex) {
                System.out.println("Enter Student's fourth score again!");
            }
        }
    }

    //// getter && setter
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
