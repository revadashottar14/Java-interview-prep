package day01;

public class Main {
    public static void main(String[]args){
        System.out.println("----Razorpay-----");
        OrderService service1 = new OrderService(new RazorpayGateway());
        service1.placeOrder("iphone17",50000.0);

        System.out.println("MOCKpay");
        OrderService service2 = new OrderService(new MockPaymentGateway());
        service2.placeOrder("iphone13", 79999.0);
    }
}
