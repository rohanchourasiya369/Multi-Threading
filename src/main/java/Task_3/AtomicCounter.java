package Task_3;

import java.util.concurrent.atomic.AtomicInteger;

public class  AtomicCounter {
    private static int normalCounter=0;
    private static AtomicInteger atomicInteger = new  AtomicInteger(0);

    static void main(String[] args) throws InterruptedException {
        Runnable task = () ->{
            for(int i=0;i<1000;i++){
                normalCounter++;
                atomicInteger.incrementAndGet();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Normal Counter = "+normalCounter);
        System.out.println("Atomic Counter = "+atomicInteger.get());

    }
}
