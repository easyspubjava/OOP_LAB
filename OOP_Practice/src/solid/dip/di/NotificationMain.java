package solid.dip.di;

public class NotificationMain {
    public static void main(String[] args){
        MessageSender smsSender = new SmsSender();
        Notification notification = new Notification(smsSender);
        notification.sendMessage("010", "2345");
    }
}
