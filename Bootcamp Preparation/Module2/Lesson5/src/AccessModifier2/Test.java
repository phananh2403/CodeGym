package AccessModifier2;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student's name is: " + student1.setName());
        System.out.println("Student's class is: " + student1.setClasses());
    }
}
