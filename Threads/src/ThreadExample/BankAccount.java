package ThreadExample;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    int balance = 1000;

    public synchronized void withdraw(int amount) throws InterruptedException{

        if(balance < amount){
            System.out.println(Thread.currentThread().getName()+ "entered withdraw()");
            System.out.println(Thread.currentThread().getName()+ "acquired LOCk on bank account");

            wait();

            System.out.println(Thread.currentThread().getName()+ "got NOTIFIED and reacquired LOCK");
        }

        balance = balance - amount;
        System.out.println(Thread.currentThread().getName()+ "completed withdrawl.");
        System.out.println("Remaining Balance = "+ balance);
    }

    public synchronized void deposit(int amount){

        System.out.println(Thread.currentThread().getName()+ "entered deposit");
        System.out.println(Thread.currentThread().getName()+ "acquired LOCK on bank account");

        balance = balance+amount;

        System.out.println(Thread.currentThread().getName()+ "deposited amount");
        System.out.println("Updated balance = "+ balance);

        notify();

        System.out.println(Thread.currentThread().getName()+ "sent NOTIFY signal");

        System.out.println(Thread.currentThread().getName()+ "releasing LOCK");
    }

}
