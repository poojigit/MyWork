package DependencyInversion.example2;

public class Main {

    public static void main(String[] args) {
        PaymentGateway paytm=new Paytm();
        PaymentProcessor processor=new PaymentProcessor(paytm);
        processor.process(123.789);

        PaymentGateway razorpay=new RazorPay();
        PaymentProcessor processor1=new PaymentProcessor(razorpay);
        processor1.process(347.99);

        PaymentGateway creditcard=new CreditCard();
        PaymentProcessor processor2=new PaymentProcessor(creditcard);
        processor2.process(5678.99);
    }
}
