package InterfaceSegregation.example1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.processPayment(2000);
        creditCard.refundPayment(200);

        BankTransfer bankTransfer = new BankTransfer();
        bankTransfer.processPayment(15000);
        bankTransfer.refundPayment(5000);

        PayPal payPal = new PayPal();
        payPal.processPayment(40000);
        payPal.refundPayment(10000);
        payPal.applyDiscount(100);
    }
}
