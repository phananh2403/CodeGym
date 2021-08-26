package Manager.ObjectManager;

import Manager.Object.Student;

import java.util.Comparator;

public class SortStudent implements Comparator<Student> {
    @Override
    public int compare(Student student1,Student student2){
        if(student1.getDtb_() < student2.getDtb_()){
            return 1;
        }
        return -1;
    }
}
