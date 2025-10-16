package Task_2;

public class Buffer {
    int data;
    boolean value=false;

    synchronized  void produce(int item){
        while(value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data=item;
        value = true;
        System.out.println("Produce : "+data);
        notify();
    }

    synchronized  void consume(){
        while(!value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value = false;
        System.out.println("Consume : "+data);
        notify();
    }
}
