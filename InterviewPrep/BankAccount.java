package InterviewPrep;

public class BankAccount {

    private double bankBalance;

    public double getBankBalance(){
        return bankBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            bankBalance+=amount;
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(5000);
        System.out.println("Current bank balance is: " +account1.getBankBalance());
    }
}
