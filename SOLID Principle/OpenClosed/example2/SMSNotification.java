package OpenClosed.example2;

public class SMSNotification implements Notification{
    @Override
    public void notify(String message) {
        System.out.println("Message is sent via:" +message);
    }
}
