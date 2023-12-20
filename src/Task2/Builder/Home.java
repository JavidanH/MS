package Task2.Builder;

public class Home {

    private String city;
    private String street;
    private int room;
    private int squareMetr;
    private boolean parking;


    public Home() {
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", room=" + room +
                ", squareMetr=" + squareMetr +
                ", parking=" + parking +
                '}';
    }

    public Home(String city, String street, int room, int squareMetr, boolean parking) {
        this.city = city;
        this.street = street;
        this.room = room;
        this.squareMetr = squareMetr;
        this.parking = parking;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getRoom() {
        return room;
    }

    public int getSquareMetr() {
        return squareMetr;
    }

    public boolean isParking() {
        return parking;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setSquareMetr(int squareMetr) {
        this.squareMetr = squareMetr;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }
}
