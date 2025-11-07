package Task_3;

public class Main {
    static void main() throws InterruptedException {
       // CounterWithoutVolatile t =  new CounterWithoutVolatile();
        CounterWithVolatile t2 = new CounterWithVolatile();
       // t.start();
        t2.start();
        Thread.sleep(2000);
       // t.stopRunning();
        t2.stopRunning();
        System.out.println("Stop Request....");


    }
}
