package latihan5_dip.good;

// ABSTRACTION (Interface)
public interface NotificationSender {

    // TODO: Uncomment dan implementasikan
    /*
     * Send notification to customer
     * Implementasi bisa bermacam-macam:
     * - Email notification
     * - SMS notification
     * - Push notification
     * - WhatsApp notification
     * - Mock sender for testing
     *
     * @param recipient - Recipient address (email/phone)
     * @param message - Notification message
     */

    void sendNotification(String recipient, String message);

}
