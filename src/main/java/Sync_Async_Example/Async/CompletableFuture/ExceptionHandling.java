package Sync_Async_Example.Async.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionHandling {
    static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            if(true) throw  new RuntimeException("Error!");
            return  10;
        }).exceptionally(ex ->{
            System.out.println("Handled Error : "+ex.getMessage());
            return 0;
        }).thenAccept( sum ->{
            System.out.println("Result : "+sum);
        });
    }
}
