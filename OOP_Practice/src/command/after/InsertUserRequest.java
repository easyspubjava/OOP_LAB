package command.after;


public class InsertUserRequest extends Request {
    UserInfo userInfo;

    public InsertUserRequest(Receiver receiver) {
        super(receiver);
    }

}
