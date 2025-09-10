package SingleResponsibility.example2;

public class UserValidator {
    public boolean isValid(String username, String email){
     return username!=null && email.contains("@");
    }
}
