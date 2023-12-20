package Task2.Decorator;

public class TurnedCarDecorator extends CarDecorator {


    public TurnedCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        decoratedCar.drive();
        setSpoiler(decoratedCar);
    }

    private void setSpoiler(Car decoratedCar){
        System.out.println("Make Spoiler");
    }

}
