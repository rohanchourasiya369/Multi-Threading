package Sync_Async_Example.Async;

public class RunnableInterface {
    static void main(String[] args) {
        Runnable task= () -> System.out.println("Async using Runnable Interface...");
        new Thread(task).start();
    }
}
