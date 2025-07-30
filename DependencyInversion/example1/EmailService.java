package DependencyInversion.example1;

public class EmailService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending notification via Email:" +message);
    }
}
