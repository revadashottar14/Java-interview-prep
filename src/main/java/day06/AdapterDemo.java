package day06;

public class AdapterDemo {
    public static void main(String[]args){
        PaymentGateway paymentGateway;

        paymentGateway = new RazorpayGateway();
        processOrder(paymentGateway,500);

        System.out.println();

        PayU payU = new PayU();
        paymentGateway = new PayUAdapter(payU);
        processOrder(paymentGateway, 500);
    }

    static void processOrder(PaymentGateway paymentGateway, double amount){
        System.out.println("Processing order of "+paymentGateway.getGateway());
        paymentGateway.charge(amount);
    }
}
