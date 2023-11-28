package solid.dip.di;

public class InboxSender implements MessageSender{

    @Override
    public void send(String cellphone, String message) {
        System.out.println("Inbox sending... " + message);
    }
}
