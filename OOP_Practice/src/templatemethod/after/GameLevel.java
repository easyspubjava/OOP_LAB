package templatemethod.after;

public abstract class GameLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();

    final public void go(int count){
        run();
        for(int i =0; i<count; i++){
            jump();
        }
        turn();
    }
}
