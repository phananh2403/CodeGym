package DSA.MyQueueArray;

import java.util.ArrayList;

public class MyQueue2 {
    ArrayList<String> elements = new ArrayList<>();

    public void add(String str) throws Exception {
        elements.add(str);
    }

    public boolean offer(String str) {
        if (elements.add(str))
            return true;
        return false;
    }

    public String element() throws Exception {
        return elements.get(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public String peek() {
        if (isEmpty())
            return null;
        return elements.get(0);
    }

    public void remove() throws Exception {
        elements.remove(0);
    }

    public String poll() {
        if (isEmpty())
            return null;
        return elements.remove(0);
    }

    public int size(){
        return elements.size();
    }
    public void printQueue(){
        System.out.println(elements);
    }
}
