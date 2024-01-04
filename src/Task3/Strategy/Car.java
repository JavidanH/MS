package Task3.Strategy;

public class Car implements TransportStrategy{
    @Override
    public void commute() {
        System.out.println("Transportation Car");
    }
}
