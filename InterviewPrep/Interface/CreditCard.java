package InterviewPrep.Interface;

public class CreditCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Amount of " +amount+ " is paid using Credit Card.");
    }
}
