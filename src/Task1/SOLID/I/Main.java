package Task1.SOLID.I;

public class Main {
    public static void main(String[] args) {
        Engine disel = new DiselCar();
        Engine electric = new ElectricCar();
        Engine petrol = new PetrolCar();

        disel.pressBreak();
        disel.startEngine();
        disel.stopEngine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        electric.startEngine();
        electric.stopEngine();
        electric.pressBreak();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        petrol.startEngine();
        petrol.stopEngine();
        petrol.pressBreak();
    }
}
