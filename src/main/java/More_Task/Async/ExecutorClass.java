package More_Task.Async;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClass {
    static void main(String[] args) {
        ExecutorService  service = Executors.newFixedThreadPool(3);

        for (int i=1;i<=5;i++){
            int tasknew=i;
            service.submit(()->{
                System.out.println("Task "+tasknew+Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}
