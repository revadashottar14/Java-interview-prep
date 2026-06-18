package day07;

public class UnsafeBankAccount {
    private double balance = 10000;
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance() {
        return balance;
    }
}
