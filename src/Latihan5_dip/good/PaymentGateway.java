package latihan5_dip.good;

// ABSTRACTION (Interface)
public interface PaymentGateway {

    // TODO: Uncomment dan implementasikan
    /*
     * Charge payment to card
     * Implementasi bisa bermacam-macam:
     * - Stripe payment gateway
     * - PayPal payment gateway
     * - Midtrans payment gateway
     * - Mock gateway for testing
     *
     * @param cardNumber - Card number to charge
     * @param amount - Amount to charge
     * @return transaction ID
     */

    String charge(String cardNumber, double amount);

}
