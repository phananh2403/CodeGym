package List.Linked;

import java.util.Collection;
import java.util.LinkedList;

public class MyLinkedList<E> {
    protected Node head;
    protected int numNodes = 0;
    protected Node tail;
    E element;


    public static class Node<E> {

        public E element;
        protected Node next = null;
        protected Object data;

        protected Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public Node getNext() {
            return next;
        }
    }

    public void LinkedList(Object data) {
        head = new Node(data);
        tail = head;
    }

    //thêm một phần tử mới vào đầu danh sách
    /*
     * Tạo 1 nút mới
     * Nút mới -> next = head
     * head = nút mới
     * */
    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;

        if (tail == null)
            tail = head;
    }

    //thêm một phần tử mới vào cuối danh sách
    /*
     * Tạo 1 nút mới
     * Nếu DSLK chỉ có 1 nút thì head = tail = nút mới.
     * Ngược lại:
     *   + Liên kết nút mới với nút cuối
     *   + Nút cuối trỏ đến nút mới
     * */
    public void addLast(E e) {
        Node newNode = new Node(e);
        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        numNodes++;
    }

    //thêm một phần tử mới vào danh sách
    public void add(int index, E e) {
        if (index == 0) addFirst(e); // Insert first
        else if (index >= numNodes) addLast(e); // Insert last
        else { // Insert in the middle
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(e);
            (current.next).next = temp;
            numNodes++;
        }
    }

    //Xóa đầu
    public void removeFirst() {
        Node temp = head.next;
        head.next = null;
        head = temp;
        numNodes--;
    }

    //Xóa cuối
    public E removeLast() {
        if (numNodes == 0) return null;
        else if (numNodes == 1) {
            Node temp = head;
            head = tail = null; // list becomes empty
            numNodes = 0;
            return (E) temp.element;
        } else {
            Node current = head;

            for (int i = 0; i < numNodes - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.element;
        }

    }

    //xóa 1 phần tử
    public boolean remove(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(data)) {
                if (remove(i)) {
                    return true;
                }
            }
            temp = temp.next;
        }
        return false;
    }

    //xóa 1 phần tử tại vị trí index
    public boolean remove(int index) {
        if (index < 0 || index >= numNodes) return false; // Out of range
        else if (index == 0) removeFirst(); // Remove first
        else if (index == numNodes - 1) removeLast(); // Remove last
        else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (boolean) current.element;
        }

        return false;
    }

    //clear
    public void clear() {
        head = null;
        tail = null;
    }

    //số lượng các phần tử có trong danh sách
    public int size() {
        return numNodes;
    }
    //head
    public Node getHead() {
        return head;
    }
    //tail
    public Node getTail() {
        return tail;
    }

    //kiểm tra phần tử o có trong danh sách không
    public boolean isContain(Object data) {
        Node temp = head;
        while (!(temp == null)) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //trả về vị trí của phần tử o trong danh sách
    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(data)) {
                return i;
            }
            temp = temp.next;

        }
        return -1;
    }

    // sao chép danh sách ra 1 danh sách khác
    public LinkedList clone() {
        Node cloneCursor = head;
        LinkedList<Object> clone = new LinkedList<Object>((Collection<Object>) cloneCursor.getData());
        for (int i = 1; i < numNodes; i++) {
            cloneCursor = cloneCursor.next;
            clone.addLast(cloneCursor.getData());
        }
        return clone;
    }

    //in các phần tử trong danh sách
    public boolean printList() {
        System.out.println("list (" + numNodes + ")");
        List.Linked.MyLinkedList.Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println("element " + i + ": " + temp.data);
            temp = temp.next;
        }
        System.out.println("\n");
        return false;
    }

    //truy cập một phần tử trong danh sách
    public E get(int index){
        List.Linked.MyLinkedList.Node temp = head;
        for (int i = 0; i < numNodes; i++){
            if (i == index){
                return (E) temp.data;
            }
        }
        return null;
    }
}
