package Task_2;

public class BankExample {
    static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread( () ->{
            account.withdraw("Rohan",800);
            BankAccount.countrecord();
        });
        Thread t2 = new Thread( () ->{
            account.withdraw("Kushal",900);
            BankAccount.countrecord();
        });

        t1.start();
        t2.start();

    }
}
