package day05;

public class BuilderDemo {
    public static void main(String[]args){
        Transaction txs = new Transaction.Builder()
                .withId("TX001")
                .withAmount(6000.0)
                .withCcy("USD")
                .withType("CARD")
                .build();

        System.out.println(txs);

        Transaction txs2 = new Transaction.Builder()
                .withId("TX002")
                .withAmount(9000.0)
                .withType("UPI")
                .build();

        System.out.println(txs2);
    }
}
