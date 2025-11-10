package Sync_Async_Example.Async.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ChainingExample {
    static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            System.out.println("Step 1 : Fetch Data");
            return 100;
        }).thenApply(data->{
            System.out.println("Step 2 : Process Data");
            return  2*data;
        }).thenAccept(finalData->{
            System.out.println("Step 3 : Final Data = "+finalData);
        });
    }
}
