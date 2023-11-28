package solid.dip.di;

public class NotificationMain {
    public static void main(String[] args){
        MessageSender smsSender = new SmsSender();
        Notification smsNotification = new Notification(smsSender);
        MessageSender inboxSender = new InboxSender();
        notification.sendMessage("010", "2345");
    }
}
