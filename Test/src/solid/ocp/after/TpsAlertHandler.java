package solid.ocp.after;

public class TpsAlertHandler extends AlertHandler{
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {

        if(apiStateInfo.getTimeCount() > rule.getMatchedRule(api).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
