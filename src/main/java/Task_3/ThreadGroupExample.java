package Task_3;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("WorkerGroup");

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " running");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        };

        Thread t1 = new Thread(group, task, "Worker-1");
        Thread t2 = new Thread(group, task, "Worker-2");

        t1.start();
        t2.start();

        System.out.println("Active threads in group: " + group.activeCount());
        group.list(); // print thread info
    }
}

