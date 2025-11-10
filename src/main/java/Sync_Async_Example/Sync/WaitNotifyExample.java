package Sync_Async_Example.Sync;

public class WaitNotifyExample {
    static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread waiting = new Thread(()->{
            try {
                resource.receiveSignal();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"WaiterThread");

        Thread notifier = new Thread(()->{
            resource.sentSignal();
        },"NotifierThread");

        waiting.start();
        notifier.start();
    }

}
