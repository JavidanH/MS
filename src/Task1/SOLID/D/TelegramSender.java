package Task1.SOLID.D;

public class TelegramSender implements Messaging {


    @Override
    public void sendMessage(String message) {
        System.out.println("Send Telegram message -->" + message);
    }
}
