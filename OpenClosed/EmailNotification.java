package OpenClosed;

public class EmailNotification implements Notification{
    @Override
    public void notify(String message) {

        System.out.println("The notification is sent via:" +message);
    }
}
