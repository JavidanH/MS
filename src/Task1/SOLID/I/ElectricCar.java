package Task1.SOLID.I;

public class ElectricCar implements Engine, Electric {
    @Override
    public void charge() {
        System.out.println("Electric car charging");
    }

    @Override
    public void startEngine() {
        System.out.println(" Electric car  engine start");
    }

    @Override
    public void stopEngine() {
        System.out.println(" Electric car engine stop");
    }

    @Override
    public void pressBreak() {
        System.out.println(" Electric car driver  press break");
    }
}
