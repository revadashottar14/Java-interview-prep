package day01;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void charge(String transactionId, double amount){
     System.out.println("Razorpay: Charging ₹" + amount + " for TXN: " + transactionId);
}
    @Override
    public void refund(String transactionId, double amount) {
        System.out.println("Razorpay: Refunding ₹" + amount + " for TXN: " + transactionId);
    }
}
