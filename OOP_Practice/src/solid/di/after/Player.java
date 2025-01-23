package solid.di.after;

public class Player {

    GameLevel gameLevel;

    public Player(){
        gameLevel = new BeginnerLevel();
    }

    public void upgradeLevel(GameLevel gameLevel){
        this.gameLevel = gameLevel;
    }

    public void play(int count){
        gameLevel.go(count);
    }
}
