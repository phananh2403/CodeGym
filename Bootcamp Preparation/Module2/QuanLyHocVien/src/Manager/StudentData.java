package Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private static final String STUDENT_FILE = "student.txt";

    //lưu data vào file
    public void write(List<Student> studentList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File(STUDENT_FILE));
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fileOutputStream);
            closeStream(objectOutputStream);
        }
    }

    //đọc dữ liệu từ file
    public List<Student> read() {
        List<Student> studentList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(STUDENT_FILE));
            objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fileInputStream);
            closeStream(objectInputStream);
        }
        return studentList;
    }

    //close input stream
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //close output stream
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
