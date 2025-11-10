package Sync_Async_Example.Async.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class RunAsyncExample {
    static void main(String[] args) {
        CompletableFuture.runAsync(()->{
            System.out.println("Running Thread : "+Thread.currentThread().getName());
        });
        System.out.println("Main Thread Continue...");
    }
}
