package day04;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {
    public static void main (String[]args){
        List<Transaction> txs = new ArrayList<>();

        txs.add(new Transaction("TX001", 500.0));
        txs.add(new Transaction("TX002", 300.0));
        txs.add(new Transaction("TX003", 400.0));

        System.out.println("Before"+txs);

        txs.sort((a,b)->Double.compare(a.amount, b.amount));
        System.out.println("After"+txs);

        txs.sort((a,b)->Double.compare(b.amount, a.amount));
        System.out.println("After2"+txs);

        txs.sort((a,b) -> a.id.compareTo(b.id));
        System.out.println("After3"+txs);
    }
}
