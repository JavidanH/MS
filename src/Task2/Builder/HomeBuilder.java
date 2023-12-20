package Task2.Builder;

public class HomeBuilder {

    private String city;
    private String street;
    private int room;
    private int squareMetr;
    private boolean parking;


    public static HomeBuilder startBuild(){
        return new HomeBuilder();
    }

    public Home build(){
        Home home = new Home();
        home.setCity(city);
        home.setStreet(street);
        home.setRoom(room);
        home.setSquareMetr(squareMetr);
        home.setParking(parking);
        return home;
    }

    public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public HomeBuilder setRoom(int room) {
        this.room = room;
        return this;
    }

    public HomeBuilder setSquareMetr(int squareMetr) {
        this.squareMetr = squareMetr;
        return this;
    }

    public HomeBuilder setParking(boolean parking) {
        this.parking = parking;
        return this;
    }
}
