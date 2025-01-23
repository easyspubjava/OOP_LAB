package observer.before;

public class ConsoleObserver extends Observer {

    @Override
    public void update(String message) {
        System.out.println("Console Observer : " + message);
    }
}
