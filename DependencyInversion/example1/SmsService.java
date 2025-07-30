package DependencyInversion.example1;

public class SmsService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending notification via SMS:" +message);
    }
}
