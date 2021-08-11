package DSA.MyLinked;
import List.Linked.MyLinkedList;
public class Stack {
    MyLinkedList<String> stack = new MyLinkedList<>();

    public void push(String str){
        stack.add(0, str);
    }
    public void pop(){
        stack.removeLast();
    }
    public void peek(){
        stack.getTail();
    }
    public boolean isFull(){
        if(stack.size()==0)
            return false;
        return true;
    }
    public boolean isEmpty(){
        if(stack.getHead() == null && stack.getTail() == null)
            return true;
        return false;
    }

    public void printStack(){
        System.out.println(stack);
    }
}
