package Task_3;

public class CounterWithoutVolatile extends Thread{

    private boolean running = true;

    public void run() {
        System.out.println("Thread Started....");

        while (running){}
        System.out.println("Thread Stopped...");
    }

    public  void stopRunning(){
        running = false;
    }
}
