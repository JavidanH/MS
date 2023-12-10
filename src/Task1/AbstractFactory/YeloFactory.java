package Task1.AbstractFactory;

public class YeloFactory implements CardFactory{
    @Override
    public CreditCard createCreditCard() {
        return new YeloCreditCard();
    }

    @Override
    public DebitCard createDebitCard() {
        return new YeloDebitCard();
    }
}
