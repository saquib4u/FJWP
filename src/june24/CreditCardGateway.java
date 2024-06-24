package june24;

public class CreditCardGateway extends PaymentGateway{
	 private String cardNumber;
	 private String expirationDate;

	    public CreditCardGateway(String paymentMethod, String cardNumber, String expirationDate) {
	        super(paymentMethod);
	        this.cardNumber = cardNumber;
	        this.expirationDate = expirationDate;
	    }
	    @Override
	    public boolean processPayment(double amount) {
	        System.out.println("Processing credit card payment of Rs " + amount + " using card number " + cardNumber);
	        return true; 
	    }
}
