package Task2.Decorator;

public class Main {

    public static void main(String[] args) {
         Car simpleCar = new SimpleCar();

         Car turnedCar = new TurnedCarDecorator(new SimpleCar());

        System.out.println("Simple Car");
        simpleCar.drive();


        System.out.println("Turned Car");
        turnedCar.drive();
    }
}
