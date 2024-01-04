package Task3.Strategy;

public class Bus implements  TransportStrategy{
    @Override
    public void commute() {
        System.out.println("Transportation Bus");
    }
}
