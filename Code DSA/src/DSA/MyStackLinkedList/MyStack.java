package DSA.MyStackLinkedList;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> elements = new LinkedList<>();

    public void push(String str){
        elements.addFirst(str);
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    public boolean isFull(){
        if (elements.size() == elements.size())
            return true;
        return false;
    }
    public String pop(){
        if (elements.isEmpty())
            return null;
        return elements.removeLast();
    }
    public String peek(){
        if (elements.isEmpty())
            return null;
        return elements.getLast();
    }

    public void printStack(){
        System.out.println(elements);
    }
}
