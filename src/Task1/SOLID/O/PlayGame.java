package Task1.SOLID.O;

public class PlayGame {

    public void playGame(Sport[] sports){
        for (Sport sport : sports){
            sport.play();
        }
    }
}
