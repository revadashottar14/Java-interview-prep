package day01;

public class OrderService {

    private final PaymentGateway paymentGateway;  // ← field declared here

    public OrderService(PaymentGateway paymentGateway) {  // ← public, not private. No "final"
        this.paymentGateway = paymentGateway;             // ← capital G on both sides
    }

    public void placeOrder(String itemName, double amount) {
        System.out.println("\nPlacing order for: " + itemName);
        paymentGateway.charge("TXN-001", amount);
        System.out.println("Order done!");
    }
}