package day05;

public class PaymentGatewayFactory {
    public static PaymentGateway CreateGateway(String Type){
        switch (Type) {
            case "RazorPay":
                return new RazorPayGateway();
            case "PayU":
                return new PayUGateway();
            case "NetBanking":
                return new NetBankingGateway();
            default:
                throw new IllegalArgumentException("No Such Gateway " +Type);
        }

    }
}
