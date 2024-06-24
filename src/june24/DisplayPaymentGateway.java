package june24;

public class DisplayPaymentGateway {
    public static void main(String[] args) {
        CreditCardGateway creditCard = new CreditCardGateway("Credit Card", "1234-5678-9012-3456", "12/2025");
        if (creditCard.processPayment(100.0)) {
            System.out.println("Credit card payment successful");
        } else {
            System.out.println("Credit card payment failed");
        }

        PaypalGateway payPal = new PaypalGateway("PayPal", "saquib4u@example.com");
        if (payPal.processPayment(50.0)) {
            System.out.println("PayPal payment successful");
        } else {
            System.out.println("PayPal payment failed");
        }
    }
}