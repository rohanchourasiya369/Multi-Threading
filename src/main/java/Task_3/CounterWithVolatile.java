package Task_3;

public class CounterWithVolatile extends  Thread{

    private volatile boolean running = true;

    public  void run(){
        System.out.println("Thread Started....");
        while (running){}
        System.out.println("Thread Stopped....");
    }

    public  void stopRunning(){
        running = false;
    }
}
