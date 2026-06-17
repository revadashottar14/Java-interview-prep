package day04;

import java.util.ArrayList;
import java.util.List;

public class Transaction implements Comparable<Transaction> {

    String id;
    double amount;

    public Transaction(String id, double amount){
        this.id = id;
        this.amount = amount;
    }
    @Override
    public int compareTo(Transaction o) {
        if(this.amount > o.amount) return 1;
        if(this.amount < o.amount) return -1;
        return 0;
    }
    @Override
    public String toString(){
        return id + "rs." + amount;
    }
}
