package command.after;

public class CommandTest {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo(12345, "James", "123!@#");

        InsertUserReceiver insertUserReceiver = new InsertUserReceiver(userInfo);
        DeleteUserReceiver deleteUserReceiver = new DeleteUserReceiver(userInfo);

        Request insertUserRequest = new InsertUserRequest(insertUserReceiver);
        Request deleteRequest = new DeleteUserRequest(deleteUserReceiver);

        Request[] requests = new Request[]{insertUserRequest, deleteRequest};
        for (Request request : requests) {
            request.execute();
        }
    }
}
