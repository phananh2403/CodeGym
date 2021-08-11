package DSA.MyQueueArray;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("kli");
        queue.printQueue();

        System.out.println("Is Stack Queue:" + queue.isEmpty());

        System.out.println(queue.peek());



    }
}
