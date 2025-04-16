package command.after;

public class InsertUserReceiver implements Receiver {
    UserInfo userInfo;

    public InsertUserReceiver(UserInfo userInfo){
        this.userInfo = userInfo;
    }

    @Override
    public void action() {
        System.out.println("Insert User" + userInfo);
    }
}
