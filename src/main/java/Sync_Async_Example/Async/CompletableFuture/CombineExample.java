package Sync_Async_Example.Async.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CombineExample {
    static void main(String[] args) {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(()-> 50);
        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(()-> 30);

        CompletableFuture<Integer> combine = task1.thenCombine(task2,(a,b) -> a+b);

        combine.thenAccept(sum -> System.out.println("Result : "+sum));
    }
}
