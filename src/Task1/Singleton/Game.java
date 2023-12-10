package Task1.Singleton;

public enum Game {

    FOOTBALL;

    private int score;

    void playGame(){
        System.out.println("Playing ");
    }

    void startGame(){
        System.out.println("Game stated");
        score = 0;
    }

    void getScore( int points){
        System.out.println("Get score");
        score += points;
        System.out.println("Score is " + points);
    }
}
