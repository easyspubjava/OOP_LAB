package solid.ocp.after;

public abstract  class AlertHandler {

    AlertRule alertRule;
    Notification notification;

    public AlertHandler(AlertRule rule, Notification notification){
        this.alertRule = rule;
        this.notification = notification;
    }

    public abstract  void check(ApiStateInfo apiStateInfo);
}
