package DependencyInversion.example2;

public class Main {
    public static void main(String[] args) {
        PaymentGateway rg=new RazorpayGateway();
        PaymentProcessor processor= new PaymentProcessor(rg);
        processor.process(999.999);

        PaymentGateway pg =new PaytmGateway();
        PaymentProcessor processor1=new PaymentProcessor(pg);
        processor1.process(1222.22);
    }

}
