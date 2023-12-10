package Task1.AbstractFactory;

public class BankApp {
    public static void main(String[] args) {
        CardFactory birCardFactory = new BirCardFactory();
        CreditCard bircardCreditCard = birCardFactory.createCreditCard();
        DebitCard bircardDebitCard  = birCardFactory.createDebitCard();

        bircardCreditCard.swipe();
        bircardDebitCard.insert();
    }
}
