package Task1.SOLID.D;

public class Main {

    public static void main(String[] args) {
        Messaging whatsappSender = new WhatsAppSender();
        Messaging telegramSender = new TelegramSender();

        MessagingApp whatsappApp = new MessagingApp(whatsappSender);
        MessagingApp telegramApp = new MessagingApp(telegramSender);

        whatsappApp.sendMessage("Hello WhatsApp User");
        telegramApp.sendMessage("Hello Telegram User ");
    }
}
