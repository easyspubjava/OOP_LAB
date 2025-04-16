package command.after;

public class DeleteUserReceiver implements Receiver{

    UserInfo userInfo;

    public DeleteUserReceiver(UserInfo userInfo){
        this.userInfo = userInfo;
    }

    @Override
    public void action() {
        System.out.println("Delete User" + userInfo.getId());
    }
}
