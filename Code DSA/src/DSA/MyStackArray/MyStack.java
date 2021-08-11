package DSA.MyStackArray;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> elements = new ArrayList<>();

    public void push(String str) {
        elements.add(str);
    }

    public String pop() {
        if (elements.isEmpty())
            return null;
        return elements.remove(elements.size() - 1);
    }

    public String peek() {
        if (elements.isEmpty())
            return null;
        String top = elements.get(elements.size() - 1);
        return top;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean isFull() {
        if (elements.size() == elements.size())
            return true;
        return false;
    }

    public void printStack(){
        System.out.println(elements);
    }

}
