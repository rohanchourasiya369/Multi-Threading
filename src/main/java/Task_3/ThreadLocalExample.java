package Task_3;

public class ThreadLocalExample {
    private static final ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                threadLocal.set(threadLocal.get() + 1);
                System.out.println(Thread.currentThread().getName() + " => " + threadLocal.get());
            }
        };

        Thread t1 = new Thread(task, "Worker-A");
        Thread t2 = new Thread(task, "Worker-B");

        t1.start();
        t2.start();
    }
}

