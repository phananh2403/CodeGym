package DSA.MyLinked;

import List.Linked.MyLinkedList;

public class Queue {
    MyLinkedList<String> queue = new MyLinkedList<>();

    public void enqueue(String str){
        if(isEmpty())
            queue.addFirst(str);
        queue.add(queue.size(),str);
    }

    public boolean isEmpty(){
        return queue.getHead() == null && queue.getTail() == null;
    }

    public void peek(){
        queue.getHead();
    }

    public boolean isFull(){
        if(queue.size() == 0)
            return true;
        return false;
    }

    public void dequeue(){
        if (isEmpty())
            System.out.println("Queue rong");
        else if(queue.getHead() == queue.getTail())
            queue.remove(queue.getHead());
        else
            queue.removeLast();
    }

    public void printQueue(){
        System.out.println(queue);
    }
}
