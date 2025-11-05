package More_Task;

public class SynchronizationCommunication {
    static void main(String[] args) {
        System.out.println("Task 1 : File Start the downloading...");
        downloading();
        System.out.println("Task 2 : File is in Processing mode...");
        precessing();
        System.out.println("All the Tasks are done successfully!!!");
    }

    private static void precessing() {
        try {
            Thread.sleep(2000);
            System.out.println("Processing are done...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void downloading() {
        try {
            Thread.sleep(2000);
            System.out.println("Downloading is Completed...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
