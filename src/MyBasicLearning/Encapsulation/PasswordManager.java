package MyBasicLearning.Encapsulation;

public class PasswordManager {

    private String passwordHash;

    public void setPassword(String password){
        this.passwordHash = Integer.toString(password.hashCode());
    }

    public boolean checkPassword(String input){
        return passwordHash.equals(Integer.toString(input.hashCode()));
    }

    public static void main(String[]args){
        PasswordManager p1 = new PasswordManager();
        p1.setPassword("Poojisha@2708");
        System.out.println("Correct? " +p1.checkPassword("Poojisha@2708"));
        System.out.println("Wrong? " +p1.checkPassword("abc@123"));
    }
}
