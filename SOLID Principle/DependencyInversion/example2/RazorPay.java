package DependencyInversion.example2;

public class RazorPay implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs." +amount+ " via RazorPay");
    }
}
