package Task1.AbstractFactory;

public class BirCardFactory implements CardFactory{
    @Override
    public CreditCard createCreditCard() {
        return new BircardCreditCard();
    }

    @Override
    public DebitCard createDebitCard() {
        return new BirCardDebitCard();
    }
}
