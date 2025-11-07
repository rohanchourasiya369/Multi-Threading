package More_Task.Sync;

public class SharedResource{

    private boolean ready=false;

    public synchronized void sentSignal(){
        ready=true;
        notify();
        System.out.println("Signal Sent By : "+Thread.currentThread().getName());
    }

    public  synchronized  void receiveSignal() throws InterruptedException {
        while (!ready){
            wait();
        }
        System.out.println("Signal Receive By : "+Thread.currentThread().getName());
    }

}
