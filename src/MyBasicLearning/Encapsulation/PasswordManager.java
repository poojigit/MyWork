package MyBasicLearning.Encapsulation;

public class PasswordManager {
    private String passwordHash;


    public void setPassword(String password) {
        this.passwordHash = Integer.toString(password.hashCode());
    }


    public boolean checkPassword(String input) {
        return passwordHash.equals(Integer.toString(input.hashCode()));
    }

    public static void main(String[] args) {
        PasswordManager p = new PasswordManager();
        p.setPassword("secret123");
        System.out.println("Correct? " + p.checkPassword("secret123"));
        System.out.println("Wrong? " + p.checkPassword("abc123"));
    }
}

