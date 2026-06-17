package day05;

public class PayUGateway implements PaymentGateway{
    @Override
    public void charge(double amount) {
        System.out.println("PayU Gateway Rs. "+amount);
    }
}
