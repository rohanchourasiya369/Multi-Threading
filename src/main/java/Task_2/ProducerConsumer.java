package Task_2;

public class ProducerConsumer {
    static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread produce = new Thread(() ->{
            for(int i=1;i<=5;i++){
                buffer.produce(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consume = new Thread(() ->{
            for(int i=1;i<=5;i++){
                buffer.consume();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        produce.start();
        consume.start();
    }
}
