package solid.ocp.after;


import java.util.ArrayList;
import java.util.List;

public class Alert {

    List<AlertHandler> alertHandlerList = new ArrayList<>();

    public void check(ApiStateInfo apiStateInfo){
        for(AlertHandler handler: alertHandlerList){
            handler.check(apiStateInfo);
        }

//        long tps = requestCount/errorCount;
//        if(tps > rule.getMatchedRule(api).getMaxTps()){
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//        if(errorCount > rule.getMatchedRule(api).getMaxErrorCount()){
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}
