package decorator.after;

public class EtiopiaCoffee extends Coffee {

    @Override
    public void brewing() {
        System.out.print("Etiopia Coffee ");
    }
}
