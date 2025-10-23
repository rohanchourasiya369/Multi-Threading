package Task_5;
import java.util.concurrent.*;

public class FileSimulator {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            for (int i = 1; i <= 5; i++) {
                String file = "File_" + i;
                try {
                    queue.put(file);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Added " + file + " to queue");
            }
        });

        for (int i = 1; i <= 2; i++) {
            executor.submit(() -> {
                try {
                    while (true) {
                        String file = queue.take();
                        System.out.println(Thread.currentThread().getName() + " downloading " + file);
                        Thread.sleep(800);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        Thread.sleep(5000);
        executor.shutdownNow();
    }
}
