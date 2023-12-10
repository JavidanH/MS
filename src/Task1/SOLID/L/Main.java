package Task1.SOLID.L;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car jep = new Jep();

        CarGarage carGarage = new CarGarage();
        carGarage.operateCar(sedan);
        carGarage.operateCar(jep);
    }
}
