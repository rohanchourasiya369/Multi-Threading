package Task_5;

import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private final CountDownLatch latch;
    private final int workTime;

    public Worker(String name, CountDownLatch latch, int workTime) {
        super(name);
        this.latch = latch;
        this.workTime = workTime;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " starting work...");
            Thread.sleep(workTime * 1000L);
            System.out.println(getName() + " finished work.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }
}
