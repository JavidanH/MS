package Task2.Facade;

public class BankFacade {

    private Account account;

    private Notification notification;

    public BankFacade() {
        this.account = new Account();
        this.notification = new Notification();
    }

    public void deposit (int amount){
        account.checkBalance();
        account.deposit(amount);
        notification.sendNotification("Operation successfully");
    }
}
