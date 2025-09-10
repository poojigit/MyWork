package SingleResponsibility.example2;

public class UserService {
    private UserValidator userValidator=new UserValidator();
    private UserRepository userRepository=new UserRepository();
    private EmailService emailService=new EmailService();

    public void register(String username, String email){
        if(!userValidator.isValid(username,email)){
            System.out.println("Invalid User Data");
            return;
        }

        userRepository.save(username, email);
        emailService.sendWelcomeEmail(email);
    }
}
