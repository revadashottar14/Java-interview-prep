package day06;

public class PayUAdapter implements PaymentGateway{

    private PayU payU;
    public PayUAdapter(PayU payU){
        this.payU = payU;
    }

    @Override
    public void charge(double amount) {
        payU.processPayment(amount);
    }

    @Override
    public String getGateway() {
        return payU.getName();
    }
}
