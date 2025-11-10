package Sync_Async_Example.Sync;

public class SequentialSync {
    static void main(String[] args) {
        System.out.println("Task 1 is started...");
        task1();
        task2();
        System.out.println("All Task is finished.");
    }

    private static void task2() {
        System.out.println("Task 2 is running.");
    }

    private static void task1() {
        System.out.println("Task 1 is running.");
    }
}
