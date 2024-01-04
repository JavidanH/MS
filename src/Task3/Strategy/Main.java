package Task3.Strategy;

public class Main {

    public static void main(String[] args) {

        Transportation transportation = new Transportation();

        transportation.setTransportStrategy(new Car());
        transportation.travel();


        transportation.setTransportStrategy(new Bus());
        transportation.travel();
    }
}
