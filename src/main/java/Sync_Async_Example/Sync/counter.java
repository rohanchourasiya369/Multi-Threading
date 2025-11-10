package Sync_Async_Example.Sync;

public class counter {
     static int count;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
