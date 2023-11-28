package solid.dip.di;

public class Notification {

    MessageSender messageSender;
    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String cellphone, String message) {
        messageSender.send(cellphone, message);
    }
}
