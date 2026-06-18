package day06;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }

    public void withdraw(double amt){
        if(balance < amt){
            throw new IllegalArgumentException("Balance Low");
        }
    }

    public void setBalance(double initialBalance){
        if(balance<initialBalance){
            throw new IllegalArgumentException("cannot be negative");
        }
    }
    public double getBalance(){
        return balance;
    }

    // Write the GETTER for balance
    // Write the SETTER for balance (with validation)
    // Write a withdraw method
}
