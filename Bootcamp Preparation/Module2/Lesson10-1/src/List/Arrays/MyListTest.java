package List.Arrays;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();//tạo mới danh sách CHỈ chứa String!
        System.out.println("Test phương thức add.");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F", 7);
        System.out.println("Danh sách sau khi thêm: " + Arrays.toString(list.getData()));

        System.out.println("-----------------------------------------------");
        System.out.println("Test phương thức indexOf.");
        System.out.println("Trả về -1 là không có trong danh sách!");
        System.out.println("Vị trí: " + list.indexOf("C"));
        System.out.println("Vị trí: " + list.indexOf("F"));

        System.out.println("-----------------------------------------------");
        System.out.println("Test phương thức remove.");
        System.out.println(list.remove(3));
        System.out.println("Danh sách sau khi xóa: " + Arrays.toString(list.getData()));

        System.out.println("-----------------------------------------------");
        System.out.println("Test phương thức get.");
        System.out.println(list.get(1));

        System.out.println("-----------------------------------------------");
        System.out.println("Test phương thức clear.");
        list.clear();
        System.out.println("Danh sách sau khi clear: " + Arrays.toString(list.getData()));

        System.out.println("-----------------------------------------------");
        System.out.println("Test phương thức clone.");
        MyList<String> cloneList = list.clone();
        cloneList.add("G",5);
        System.out.println(Arrays.toString(cloneList.getData()));



    }
}
