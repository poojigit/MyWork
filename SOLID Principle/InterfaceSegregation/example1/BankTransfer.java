package InterfaceSegregation.example1;

public class BankTransfer implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs." +amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding payment of Rs." +amount);

    }
}
