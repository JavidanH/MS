package Task1.SOLID.L;

public class CarGarage {
    public void operateCar(Car car){
        System.out.println("Operating the car: ");
        car.startEngine();
        car.drive();
    }
}
