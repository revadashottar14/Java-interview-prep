package day06;

public class RazorpayGateway implements PaymentGateway{
    @Override
    public void charge(double amount) {
        System.out.println("Razorpay "+amount);
    }

    @Override
    public String getGateway() {
        return "RazorPay";
    }
}
