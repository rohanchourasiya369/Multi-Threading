package Task_4;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        int[] numbers = {3, 5, 7};
        Future<Long>[] futures = new Future[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            futures[i] = service.submit(new Factorial(numbers[i]));
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Factorial of " + numbers[i] + " = " + futures[i].get());
        }

        service.shutdown();
        System.out.println("Task Completed !!!");
    }
}
