package day01;

public class MockPaymentGateway implements PaymentGateway {
    @Override
    public void charge(String transactionId, double amount){
        System.out.println("MOCK : Charging ₹" + amount + " for TXN: " + transactionId);
    }
    @Override
    public void refund(String transactionId, double amount) {
        System.out.println("MOCK: Refunding ₹" + amount + " for TXN: " + transactionId);
    }
}
