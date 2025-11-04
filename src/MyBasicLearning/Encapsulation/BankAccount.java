package MyBasicLearning.Encapsulation;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double openingBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number required");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        }
        balance -= amount;
        return true;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ACC123", 10000);
        System.out.println("Account number is: " +account1.getAccountNumber());
        System.out.println("Your current bank balance is: " +account1.getBalance());
        account1.deposit(20000);
        System.out.println("After depositing your balance is : " + account1.getBalance());
        account1.withdraw(1000);
        System.out.println("After withdraw your balance is : " + account1.getBalance());
    }
}

