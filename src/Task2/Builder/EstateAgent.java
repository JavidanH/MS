package Task2.Builder;

public class EstateAgent {

    public static void main(String[] args) {
        Home home1 = HomeBuilder.startBuild()
                .setCity("Baki")
                .setStreet("SuleymanSaniAKhundov")
                .setRoom(4)
                .setSquareMetr(120)
                .setParking(true)
                .build();

        printHome(home1);
    }

    public static void printHome(Home home) {

        System.out.println(home);
    }
}
