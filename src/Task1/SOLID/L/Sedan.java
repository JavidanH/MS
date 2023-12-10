package Task1.SOLID.L;

public class Sedan implements Car{
    @Override
    public void startEngine() {
        System.out.println("Sedan engine start");
    }

    @Override
    public void drive() {
        System.out.println("Start drive");
    }
}
