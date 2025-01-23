package solid.ocp.after;

public class TpsHandler extends AlertHandler{

    public TpsHandler(ApiStateInfo apiStateInfo, Notification notification, AlertRule rule) {
        super(apiStateInfo, notification, rule);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {

    }


}
