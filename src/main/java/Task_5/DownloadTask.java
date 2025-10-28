package Task_5;

import java.util.concurrent.BlockingQueue;

class DownloadTask implements Runnable {
    private final String fileUrl;
    private final BlockingQueue<String> queue;

    public DownloadTask(String fileUrl, BlockingQueue<String> queue) {
        this.fileUrl = fileUrl;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " downloading: " + fileUrl);
            Thread.sleep(1000); // simulate download
            queue.put(fileUrl + " -> Downloaded");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
