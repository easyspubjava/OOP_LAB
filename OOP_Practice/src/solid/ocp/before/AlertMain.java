package solid.ocp.before;

public class AlertMain {

    public static void main(String[] args) {
      Alert alert = new Alert(new AlertRule(), new Notification());
        alert.check("http://example.com", 100, 1000, 1);

    }
}
