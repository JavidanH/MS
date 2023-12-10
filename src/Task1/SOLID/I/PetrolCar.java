package Task1.SOLID.I;

public class PetrolCar implements Engine,Petrol{
    @Override
    public void startEngine() {
        System.out.println("Petrol car start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Petrol car stop engine");
    }

    @Override
    public void pressBreak() {
        System.out.println("Petrol car driver press break");
    }

    @Override
    public void petrol92() {
        System.out.println("Petrol car refueling with 92");
    }
}
