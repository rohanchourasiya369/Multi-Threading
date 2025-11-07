package Task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorFactorialExample {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = Arrays.asList(5, 6, 7, 8, 9);

        // Step 2: Create a Fixed Thread Pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Step 3: Create Callable tasks
        List<Callable<Long>> tasks = new ArrayList<>();
        for (int num : numbers) {
            tasks.add(new FactorialTask(num));
        }

        try {
            // Step 4: Submit tasks and collect Future objects
            List<Future<Long>> results = executor.invokeAll(tasks);

            // Step 5: Retrieve and display results
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Factorial of " + numbers.get(i) + " = " + results.get(i).get());
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Step 6: Shutdown executor properly
            executor.shutdown();
        }
    }
}

