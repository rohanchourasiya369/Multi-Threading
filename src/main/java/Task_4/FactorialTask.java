package Task_4;

import java.util.concurrent.Callable;

class FactorialTask implements Callable<Long> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
            Thread.sleep(100); // Simulate computation delay
        }
        System.out.println(Thread.currentThread().getName() + " calculated factorial of " + number);
        return fact;
    }
}