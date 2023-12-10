package Task1.SOLID.D;

public class WhatsAppSender implements Messaging {

    @Override
    public void sendMessage(String message) {

        System.out.println("Send Telegram message --> " + message);
    }
}
