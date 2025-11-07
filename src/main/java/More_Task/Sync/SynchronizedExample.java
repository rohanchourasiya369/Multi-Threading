package More_Task.Sync;

public class SynchronizedExample {
    static void main(String[] args) throws InterruptedException {
        counter counter = new counter();

        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() ->{
           for(int i=0;i<1000;i++){
               counter.increment();
           }
        });

        t1.start();
        t2.start();

        t1. join();
        t2.join();
        System.out.println("Count = "+counter.getCount());
    }
}
