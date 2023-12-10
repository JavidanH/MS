package Task1.SOLID.I;

public class DiselCar implements Engine, Disel{
    @Override
    public void dizel() {
        System.out.println(" Disel car refueling with disel");
    }

    @Override
    public void startEngine() {
        System.out.println("Disel car start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Disel car stop engine");
    }

    @Override
    public void pressBreak() {
        System.out.println("Disel car driver press break");
    }
}
