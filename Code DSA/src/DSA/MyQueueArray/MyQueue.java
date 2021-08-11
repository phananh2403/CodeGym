package DSA.MyQueueArray;

import java.util.ArrayList;

public class MyQueue<T> {
    ArrayList<String> elements = new ArrayList<>();
    int front = -1, rear = -1;

    //lấy phần tử ở đầu hàng đợi
    T front() {
        if (front == -1)
            return null;
        return (T) elements.get(front);
    }

    //lấy phần tử ở sau hàng đợi
    T rear() {
        if (rear == -1) {
            return null;
        }
        return (T) elements.get(rear);
    }

    public void enqueue(String str) {
        if (isEmpty()) {//kiểm tra queue có rỗng?
            front = 0;
            rear = 0;
            elements.add(str);
        } else {//queue không rỗng
            front++;
            if (elements.size() > front)//nếu kích thước queue lớn
                elements.set(front, str);//front -> next
            else
                elements.add(str);
        }
    }

    //Xóa các phần tử ở phía sau khỏi hàng đợi
    public void dequeue() {
        if (this.isEmpty()) {
            System.out.println("Hàng đợi rỗng");
        } else if (front == rear) {//hàng đợi có 1 phần tử
            front = rear = -1;
        } else //hàng đợi có hơn 1 phần tử -> tăng phía sau thêm 1 ->
            rear++;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (elements.size() == 0)
            return false;
        return true;
    }

    public String peek(){
        return (String) front();
    }

    public void printQueue(){
        System.out.println(elements);
    }
}
