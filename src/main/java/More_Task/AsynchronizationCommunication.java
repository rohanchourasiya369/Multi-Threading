package More_Task;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class AsynchronizationCommunication {
    static void main(String[] args) {
        System.out.println("Task 1 : Start the downloading....");

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() ->{
            try {
                Thread.sleep(2000);
                System.out.println("Downloaded Successfully !!!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Task 2 : Processing Mode On...");
        completableFuture.join();
        System.out.println("Down with the Processing Mode...");
    }
}
