package InterfaceSegregation.example1;

public class PayPal implements DiscountApplicable, PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs." +amount);

    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding payment of Rs." +amount);

    }

    @Override
    public void applyDiscount(double discount) {
        System.out.println("Applying discount of Rs."+discount+"\n on PayPal payment");
    }

}
