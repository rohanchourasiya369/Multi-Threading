package Task_5;

public class CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(3);

        for (int i = 1; i <= 3; i++) {
            final int workerId = i;
            new Thread(() -> {
                System.out.println("Worker " + workerId + " is doing task...");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                System.out.println("Worker " + workerId + " done.");
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("All workers finished. Main continues.");
    }
}
