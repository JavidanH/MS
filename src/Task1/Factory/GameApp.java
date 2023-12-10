package Task1.Factory;

public class GameApp {
    public static void main(String[] args) {
        PlayerFactory footballFactory = new FootballPlayerFactory();
        Player footballPlayer = footballFactory.createPlayer();
        footballPlayer.play();
    }
}
