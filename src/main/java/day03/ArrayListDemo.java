package day03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> payments = new ArrayList<>();
        payments.add("CARD");
        payments.add("WALLET");
        payments.add("CASH");
        payments.add("NETBANKING");
        System.out.println(payments);
        System.out.println(payments.get(2));
        System.out.println(payments.size());

        payments.add(1,"CRYPTO");
        System.out.println(payments);

        payments.remove("CASH");
        System.out.println(payments);

    }
}