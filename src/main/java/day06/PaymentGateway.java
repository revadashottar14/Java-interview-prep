package day06;

public interface PaymentGateway {
    void charge(double amount);
    public String getGateway();
}