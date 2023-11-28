package solid.ocp.before;


public class Alert {
    private AlertRule rule;
    private Notification notification;


    public Alert(AlertRule rule, Notification notification){
        this.rule = rule;
        this.notification = notification;
    }
//
//    public void check(String api, long requestCount, long errorCount, long duration){
//        long tps = requestCount/errorCount;
//        if(tps > rule.getMatchedRule(api).getMaxTps()){
//            notification.notify(NotificationEmergencyLevel.EROOR, "...");
//        }
//        if(errorCount > rule.getMatchedRule(api).getMaxErrorCount()){
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
//    }
}
