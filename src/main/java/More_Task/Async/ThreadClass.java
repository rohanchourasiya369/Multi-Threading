package More_Task.Async;

public class ThreadClass {
    static void main(String[] args) {
        Thread t1 = new Thread( () -> System.out.println("Async using Thread Class...."));
        t1.start();
    }
}






















