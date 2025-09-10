package OpenClosed.example2;

public class NotificationMain {

    public static void main(String[] args) {

        NotificationService notificationService=new NotificationService();
        notificationService.notify(new EmailNotification(),"Email");
        notificationService.notify(new SMSNotification(),"SMS");
    }
}
