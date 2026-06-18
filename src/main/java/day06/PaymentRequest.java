package day06;

public class PaymentRequest {

    private String paymentId;
    private double amount;
    private String status;
    private String userEmail;

    public PaymentRequest(String paymentId, double amount, String status, String userEmail) {

        // Validate paymentId
        if (paymentId == null || paymentId.isEmpty()) {
            throw new IllegalArgumentException("Payment ID cannot be empty!");
        }
        this.paymentId = paymentId;

        // Validate amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }
        this.amount = amount;

        // Validate status
        if (!status.equals("PENDING") && !status.equals("SUCCESS") && !status.equals("FAILED")) {
            throw new IllegalArgumentException("Invalid status!");
        }
        this.status = status;

        // Validate email
        if (userEmail == null || !userEmail.contains("@")) {
            throw new IllegalArgumentException("Invalid email!");
        }
        this.userEmail = userEmail;
    }

    // GETTERS
    public String getPaymentId() { return paymentId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
    public String getUserEmail() { return userEmail; }

    // UPDATE STATUS WITH VALIDATION
    public void updateStatus(String newStatus) {
        if (!newStatus.equals("PENDING") && !newStatus.equals("SUCCESS") && !newStatus.equals("FAILED")) {
            throw new IllegalArgumentException("Invalid status!");
        }
        this.status = newStatus;
    }

    // Demo
    public static void main(String[] args) {
        PaymentRequest pr = new PaymentRequest("TX001", 7000.90, "SUCCESS", "revavyas@gmail.com");
        System.out.println("Created: " + pr.getPaymentId() + " - " + pr.getStatus());

        pr.updateStatus("SUCCESS");
        System.out.println("Updated: " + pr.getStatus());

        // Try invalid status — will throw error
        // pr.updateStatus("INVALID");
    }
}