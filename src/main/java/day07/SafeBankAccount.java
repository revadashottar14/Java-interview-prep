package day07;

public class SafeBankAccount {
    private double balance = 10000;

    public synchronized void withdraw(double amount){
        balance = balance-amount; //public  void processPayment(double amount) { logger.log("Starting payment of " + amount); Synchronised(this){ balance = balance - amount;} logger.log("Payment complete"); }
    }

    public double getBalance() {
        return balance;
    }
}
