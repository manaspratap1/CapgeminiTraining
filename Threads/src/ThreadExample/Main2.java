package ThreadExample;

public class Main2 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Withdraw Thread
        Thread withdrawThread = new Thread(() -> {
            try {
                account.withdraw(1500);   // More than balance (1000)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "With0draw-Thread");

        // Deposit Thread
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000);  // Delay so withdraw runs first
                account.deposit(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Deposit-Thread");

        withdrawThread.start();
        depositThread.start();
    }
}