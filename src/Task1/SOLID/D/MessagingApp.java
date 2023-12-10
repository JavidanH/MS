package Task1.SOLID.D;

public class MessagingApp {

    private final Messaging messaging;

    public MessagingApp(Messaging messaging) {
        this.messaging = messaging;
    }

    public void sendMessage(String message) {
        messaging.sendMessage(message);
    }
}
