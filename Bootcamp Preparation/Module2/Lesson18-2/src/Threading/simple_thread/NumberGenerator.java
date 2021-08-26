package exercise.simple_thread;

public class NumberGenerator implements Runnable{
    private Thread t;
    private final String threadName;

    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;
    public static final int MAX_PRIORITY = 10;

    public NumberGenerator(Thread t, String threadName) {
        this.t = t;
        this.threadName = threadName;
    }

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
    }

    public final void setPriority(int priority) {
        Thread.currentThread().setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Integer: " + threadName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Dừng vòng lặp trong 50 ms
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            System.out.println(t.hashCode());
            t.start();
        }
    }
}
