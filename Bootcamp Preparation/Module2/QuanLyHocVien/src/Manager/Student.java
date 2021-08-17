package Manager;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private float first_ = 0.0F; // điểm học viên lần 1
    private float second_ = 0.0f;// điểm học viên lần 2
    private float third_ = 0.0f; // điểm học viên lần 3
    private float fourth_ = 0.0f; // điểm học viên lần 4
    private float dtb_;

    public Student() {
    }

    public Student(int id, String name, float first_, float second_, float third_, float fourth_) {
        super();
        this.id = id;
        this.name = name;
        this.first_ = first_;
        this.second_ = second_;
        this.third_ = third_;
        this.fourth_ = fourth_;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFirst_() {
        return first_;
    }

    public void setFirst_(float first_) {
        this.first_ = first_;
    }

    public float getSecond_() {
        return second_;
    }

    public void setSecond_(float second_) {
        this.second_ = second_;
    }

    public float getThird_() {
        return third_;
    }

    public void setThird_(float third_) {
        this.third_ = third_;
    }

    public float getFourth_() {
        return fourth_;
    }

    public void setFourth_(float fourth_) {
        this.fourth_ = fourth_;
    }

    public float getDtb_() {
        return (first_ + second_ + third_ * 2 + fourth_ * 3) / 7;
    }
}
