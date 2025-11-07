package org.example.Task_1;

class Main {
   public static void main(String[] args) {

       Thread number =  new Thread(() ->{
           for(int i=1;i<=5;i++){
               System.out.println(Thread.currentThread().getName() + " -> "+i);
           }
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       });

       Thread alphabet =  new Thread(() ->{
           for(char ch='A';ch<='E';ch++){
               System.out.println(Thread.currentThread().getName() + " -> "+ch);
           }
           try {
               Thread.sleep(700);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       });

       //number.setName("NumberThread");
       //alphabet.setName("AlphabetThread");

       number.setPriority(Thread.MAX_PRIORITY);
       alphabet.setPriority(Thread.MIN_PRIORITY);

       number.start();
       alphabet.start();

       try {
           number.join();
           alphabet.join();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       System.out.println("All Thread are Finished the Execution.");

    }
}
