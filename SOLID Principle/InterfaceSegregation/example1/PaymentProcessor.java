package InterfaceSegregation.example1;

public interface PaymentProcessor {

    public void processPayment(double amount);
    public void refundPayment(double amount);
}
