package MyBasicLearning.Encapsulation;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double openingBalance){
        if(accountNumber == null || accountNumber.isBlank()){
            throw new IllegalArgumentException("Account number is required.");
        }

        if(openingBalance < 0){
            throw new IllegalArgumentException("Opening balance can not be negative");
        }

        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount can not be negative.");
        }

        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if(amount > balance){
            System.out.println("Insufficient Balance.");
        }
        balance -= amount;

        return true;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("PL123", 10000);
        System.out.println("Yout current balance is " +bankAccount.getBalance());
        System.out.println("Your account number is: " +bankAccount.getAccountNumber());
        bankAccount.deposit(20000);
        System.out.println("After depositing your balance is: " +bankAccount.getBalance());
        bankAccount.withdraw(1000);
        System.out.println("After withdrawl your bank balance is: " +bankAccount.getBalance());
    }
}