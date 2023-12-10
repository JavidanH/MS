package Task1.SOLID.L;

public class Jep implements Car {
    @Override
    public void startEngine() {
        System.out.println("Jep engine started good");
    }

    @Override
    public void drive() {
        System.out.println("Start drive fast");
    }
}
