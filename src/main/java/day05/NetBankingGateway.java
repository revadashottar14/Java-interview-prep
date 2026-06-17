package day05;

public class NetBankingGateway implements PaymentGateway{
    @Override
    public void charge(double amount) {
        System.out.println("NetBanking Gateway Rs. "+amount);
    }
}
