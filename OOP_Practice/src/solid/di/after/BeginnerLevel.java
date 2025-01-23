package solid.di.after;

public class BeginnerLevel extends GameLevel{
    @Override
    public void jump() {
        System.out.println("jump 못하지롱");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 못하지롱");
    }
}
