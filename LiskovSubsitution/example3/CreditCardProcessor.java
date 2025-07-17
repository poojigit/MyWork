package LiskovSubsitution.example3;

public class CreditCardProcessor implements OnlinePaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment is processing via credit card:" +amount);
    }
}
