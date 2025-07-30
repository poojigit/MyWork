package DependencyInversion.example1;

public class NotificationManager {
    private NotificationService service;
    public NotificationManager(NotificationService service){
        this.service=service;
    }
    public void notifyUser(String message){
        service.send(message);
    }

}
