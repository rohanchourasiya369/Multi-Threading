package Task_3;

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        daemon.setDaemon(true); // Mark as daemon
        daemon.start();

        Thread.sleep(1500);
        System.out.println("Main thread exiting...");
    }
}
