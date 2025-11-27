package latihan5_dip.good;

// ABSTRACTION (Interface) - tidak depend on concrete implementation
public interface CardValidator {

    // TODO: Uncomment dan perhatikan ini adalah ABSTRACTION
    /*
     * Validate credit card number
     * Implementasi bisa bermacam-macam:
     * - Luhn algorithm validation
     * - BIN (Bank Identification Number) validation
     * - Mock validation for testing
     *
     * @param cardNumber - Card number to validate
     * @return true if valid, false otherwise
     */

    boolean validate(String cardNumber);

}
