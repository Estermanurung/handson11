package latihan5_dip.good;

public class PayPalPaymentGateway implements PaymentGateway {
    @Override
    public String charge(String cardNumber, double amount) {
        System.out.println("[PayPalPaymentGateway] Processing payment via PayPal");
        System.out.println("[PayPalPaymentGateway] Charging " + amount + " to card: " + cardNumber);

        String txId = "PAYPAL-TXN-67890";
        System.out.println("[PayPalPaymentGateway] Payment successful - Transaction ID: " + txId);

        return txId;
    }
}
