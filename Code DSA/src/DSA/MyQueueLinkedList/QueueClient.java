package DSA.MyQueueLinkedList;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("abc");
        queue.enqueue("def");
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());

    }
}
