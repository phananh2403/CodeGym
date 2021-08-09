package List.Arrays;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;

    //public MyList(){}
    public MyList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    //lấy kích thước
    public MyList(int size) {
        data = (E[]) new Object[size];
    }

    public E[] getData() {
        return this.data;
    }

    /**
     * Tăng kích thước của danh sách mảng và đảm bảo
     * nó có thể chứa dung lượng tối thiểu như đã đề cập
     * Tạo một mảng mới lớn hơn, nhân đôi kích thước hiện tại + 1
     * copyOf:tạo mảng mới có kích thước chỉ định và bao gồm các phần tử của mảng đã cho.
     */
    private void ensureCapacity() {
        if (size > data.length) {
            int biggerSize = size * 2 + 1;
            data = Arrays.copyOf(data, biggerSize);
        }
    }

    //add
    public void add(int index, E elements) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = elements;
        size++;
    }

    //remove
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    //clone
    public MyList clone() {
        MyList<E> clone = new MyList<>(data.length);
        for (E elements : data) {
            clone.add(elements);
        }
        return clone;
    }

    //thêm cuối
    public void add(E elements) {
        size += 1;
        ensureCapacity();
        data[size - 1] = elements;
    }

    //kiểm tra xem danh sách có chứa phần tử được chỉ định không?
    // Trả về true nếu DS chứa phần tử
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i]))//so sánh o với data[i] bằng hàm equals()
                return true;
        }
        return false;
    }

    //Trả về chỉ mục của phần tử phù hợp đầu tiên
    // trong danh sách này. Trả về -1 nếu không có kết quả phù hợp.
    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(data[i])) return i;
        return -1;
    }

    /*
    Thêm phần tử e tại vị trí index
    * Duyệt index trong khoảng từ 0 - size.
    * Tăng size thêm 1.(*)
    * Gọi hàm tăng kích thước.(**)
    * Duyệt từ cuối DS
    * Gán giá trị của e = giá trị của data tại vị trí index.
    * */
    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity();
            for (int i = size - 2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            return true;
        }
        return false;
    }

    //Trả lại phần tử ở chỉ mục được chỉ định (index)
    //Nếu index nằm trong khoảng cho phép (0 - size) thì trả về phần tử tại index
    public E get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    //Clear danh sách
    //Tạo dữ liệu mới & cho kích thước danh sách = 0
    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
