package Task_3;

public class UncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("Unexpected error!");
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Caught exception from " + t.getName() + ": " + e.getMessage());
        });

        thread.start();
    }
}

