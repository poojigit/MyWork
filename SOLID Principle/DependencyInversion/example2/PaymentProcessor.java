package DependencyInversion.example2;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;
    public PaymentProcessor(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }

    public void process(double amount){
        paymentGateway.pay(amount);
    }

}
