package Sync_Async_Example.Async.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class SupplyAsyncExample {
    static void main(String[] args) {
        CompletableFuture<Integer> result = CompletableFuture.supplyAsync(()->{
            System.out.println("Calculating : "+Thread.currentThread().getName());
            return  10+60;
        });

        result.thenAccept(sum -> System.out.println("Result : "+sum));

        System.out.println("Main Thread Continue...");
    }
}
