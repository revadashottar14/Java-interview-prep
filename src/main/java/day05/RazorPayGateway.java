package day05;

public class RazorPayGateway implements PaymentGateway{
    @Override
    public void charge(double amount) {
        System.out.println("Razorpay Gateway Rs. "+amount);
    }
}
