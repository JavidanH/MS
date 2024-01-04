package Task3.Strategy;

public class Transportation {

    private TransportStrategy transportStrategy;

    public Transportation() {
        this.transportStrategy = transportStrategy;
    }

    public void travel(){
        transportStrategy.commute();
    }

    public void setTransportStrategy(Car car) {
    }

    public void setTransportStrategy(Bus bus) {
    }
}
