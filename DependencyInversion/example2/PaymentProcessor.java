package DependencyInversion.example2;

public class PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway){
        this.gateway=gateway;
    }
    public void process(double amount){
        gateway.pay(amount);
    }
}
