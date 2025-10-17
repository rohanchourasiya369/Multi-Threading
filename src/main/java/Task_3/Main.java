package Task_3;

public class Main {
    static void main() throws InterruptedException {
       // CounterWithoutVolatile t =  new CounterWithoutVolatile();
        CounterWithVolatile t = new CounterWithVolatile();
        t.start();
        Thread.sleep(2000);
        t.stopRunning();
        System.out.println("Stop Request....");


    }
}
