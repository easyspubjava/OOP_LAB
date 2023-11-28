package solid.dip.di;

public class SmsSender implements MessageSender {
    @Override
    public void send(String cellphone, String message) {
        System.out.println("sms send... " + message);
    }
}
