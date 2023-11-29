package templatemethod.after;

public class Player {

    GameLevel gameLevel;
    Player(){
        gameLevel = new BeginnerLevel();
    }

    public void play(int count){
        gameLevel.go(count);
    }

    public void upgradeLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }
}
