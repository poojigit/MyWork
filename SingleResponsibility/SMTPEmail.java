package SingleResponsibility;

public class SMTPEmail implements EmailService{
    @Override
    public void send(String to) {
        System.out.println("Email is sent using SMTP" +to);
    }
}
