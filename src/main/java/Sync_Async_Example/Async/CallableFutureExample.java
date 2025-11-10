package Sync_Async_Example.Async;

import java.util.concurrent.*;

public class CallableFutureExample {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task =()->{
            Thread.sleep(1000);
            return 10+20;
        };

        Future<Integer> result = service.submit(task);
        System.out.println("Result : "+result.get());
        service.shutdown();
    }
}
