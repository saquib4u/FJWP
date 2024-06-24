package june24;

public class PaypalGateway extends PaymentGateway{
	private String emailAddress;
	 public PaypalGateway(String paymentMethod, String emailAddress) {
	        super(paymentMethod);
	        this.emailAddress = emailAddress;
	 }

	@Override
    public boolean processPayment(double amount) {
        
        System.out.println("Processing PayPal payment of Rs " + amount + " using email address " + emailAddress);
        return true; 
    }
}
