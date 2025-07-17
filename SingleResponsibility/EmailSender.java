package SingleResponsibility;

public class EmailSender {

    private final EmailService service;

    public EmailSender(EmailService service){
        this.service=service;
    }

    public void sendConfirmationEmail(String email){
        System.out.println("Confirmation email sent to:" +email);
    }
}
