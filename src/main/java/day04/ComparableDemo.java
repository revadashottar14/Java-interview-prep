package day04;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String[]args) {
        List<Transaction> txs = new ArrayList<>();
        txs.add(new Transaction("TX001", 500.0));
        txs.add(new Transaction("TX001", 300.0));
        txs.add(new Transaction("TX003", 400.0));

        System.out.println("Before"+txs);

        Collections.sort(txs);

        System.out.println("After"+txs);
    }
}
