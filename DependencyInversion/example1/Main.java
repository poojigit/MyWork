package DependencyInversion.example1;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailService();
        NotificationManager manager=new NotificationManager(email);
        manager.notifyUser("Welcome");

        NotificationService sms= new EmailService();
        NotificationManager manager1=new NotificationManager(sms);
        manager1.notifyUser("Your OTP is 1234");
    }
}
