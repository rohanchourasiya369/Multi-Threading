package Task_2;

public class BankAccount {

   private int balance = 1000;

    public synchronized  void withdraw(String name , int amount){

        if(balance>=amount){
            System.out.println("Started the Transaction.");
            System.out.println(name+" your account is in Proceeding mode.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=amount;
            System.out.println("Remaining Amount : "+balance);
        }else{
            System.out.println(name+" Entered Amount is " +  amount+" greater than balance amount."+balance);
        }
        }

        private static int count=0;

       static synchronized void countrecord(){
            count++;
            System.out.println("No of Withdraw Counted : " +count);
        }
    }
