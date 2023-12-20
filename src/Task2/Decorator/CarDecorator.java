package Task2.Decorator;

public abstract class CarDecorator implements Car{

    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {

    }

    @Override
    public void drive() {
        decoratedCar.drive();
    }
}
