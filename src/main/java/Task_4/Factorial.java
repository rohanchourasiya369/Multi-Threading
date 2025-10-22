package Task_4;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long> {
    private final int number;

    Factorial(int number){
        this.number=number;
    }

    @Override
    public Long call() throws Exception {
        long fact =1;
        for(int i=1;i<=number;i++)
            fact*=i;
        System.out.println(Thread.currentThread().getName()+" factorial number - "+number);
        return  fact;
    }
}
