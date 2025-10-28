package Task_5;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadedDownloader {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> downloadQueue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<String> files = Arrays.asList(
                "file1.zip", "file2.pdf", "file3.mp4", "file4.jpg", "file5.docx"
        );

        for (String file : files) {
            executor.submit(new DownloadTask(file, downloadQueue));
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("\nDownloaded Files:");
        while (!downloadQueue.isEmpty()) {
            System.out.println(downloadQueue.take());
        }
    }
}