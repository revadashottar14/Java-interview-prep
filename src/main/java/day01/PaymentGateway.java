package day01;

public interface PaymentGateway {
    void charge(String transactionId, double amount);
    void refund(String transactionId, double amount);
}
