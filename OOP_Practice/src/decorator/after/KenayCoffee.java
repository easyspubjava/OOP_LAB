package decorator.after;

public class KenayCoffee extends Coffee {

    @Override
    public void brewing() {
        System.out.print("Kenay Coffee ");
    }
}
