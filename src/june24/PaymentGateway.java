package june24;

public abstract class PaymentGateway {
	protected String paymentMethod;

    public PaymentGateway(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract boolean processPayment(double amount);

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
