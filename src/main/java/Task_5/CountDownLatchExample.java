package Task_5;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
        public static void main(String[] args) throws InterruptedException {
            CountDownLatch latch = new CountDownLatch(3);

            new Worker("Worker-1", latch, 2).start();
            new Worker("Worker-2", latch, 3).start();
            new Worker("Worker-3", latch, 4).start();

            System.out.println("Main thread waiting for workers...");
            latch.await();
            System.out.println("All workers done! Main thread proceeding...");

        }
}
