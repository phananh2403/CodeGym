package List.Linked;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        List.Linked.MyLinkedList<Integer> list = new List.Linked.MyLinkedList();

        System.out.println(" thêm phần tử mới");
        list.addFirst(1);
        list.addLast(5);
        list.add(1,6);
        System.out.println(list.printList());

        System.out.println("xóa 1 phần tử tại vị trí index");//Error
        list.remove(2);
        System.out.println(list.printList());

        System.out.println("xóa 1 phần tử cho trước");//Error
        list.remove("6");
        System.out.println(list.printList());

        System.out.println("truy cập một phần tử trong danh sách");//Error
        list.addFirst(1);
        list.addLast(5);
        list.add(1,6);
        System.out.println(list.get(1));

        System.out.println("trả về số lượng các phần tử có trong danh sách");
        System.out.println(list.size());

//        LinkedList listClone = list.clone();//Error
//        System.out.println(listClone);

        System.out.println("kiểm tra phần tử o có trong danh sách không");
        System.out.println(list.isContain(5));

        System.out.println("trả về vị trí của phần tử o trong danh sách");
        System.out.println(list.indexOf(6));
    }
}
