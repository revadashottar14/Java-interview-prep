package day05;

public class FactoryDemo {
    public static void main (String[]args){
        PaymentGateway gateway1 = PaymentGatewayFactory.CreateGateway("RazorPay");
        gateway1.charge(5000.00);
        PaymentGateway gateway2 = PaymentGatewayFactory.CreateGateway("PayU");
        gateway2.charge(6000.00);
    }
}
