package decorator.after;

public class MochaSyrup extends Decorator{
    public MochaSyrup(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding Mocha Syrup ");
    }
}
