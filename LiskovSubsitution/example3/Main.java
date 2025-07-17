package LiskovSubsitution.example3;

public class Main {


    public static void main(String[] args) {

        OnlinePaymentProcessor creditcard=new CreditCardProcessor();
        creditcard.processPayment(1000);

        CashOnDelivery cod=new CashOnDelivery();
        cod.markAsCashOnDelivery();
    }

}
