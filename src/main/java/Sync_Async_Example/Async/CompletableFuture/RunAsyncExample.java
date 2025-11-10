package Sync_Async_Example.Async.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class RunAsyncExample {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync( () -> {
            System.out.println("Running Thread : "+Thread.currentThread().getName());
        });
        System.out.println("Main Continue...");
        Thread.sleep(1000);
    }
}
