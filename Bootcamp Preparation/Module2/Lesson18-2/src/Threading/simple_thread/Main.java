package exercise.simple_thread;

import practice.runnable_demo.RunnableDemo;


public class Main {
    public static void main(String args[]) {
        System.out.println("Main thread running... ");

        NumberGenerator threard1 = new NumberGenerator("Thread-1");
        threard1.setPriority(NumberGenerator.MIN_PRIORITY);
        threard1.start();

        NumberGenerator threard2 = new NumberGenerator("Thread-2");
        threard2.setPriority(NumberGenerator.MAX_PRIORITY);
        threard2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
