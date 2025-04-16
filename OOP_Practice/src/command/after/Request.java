package command.after;

public abstract class Request {

    protected Receiver receiver;

    public Request( Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        receiver.action();
    }
}
