package solid.ocp.before;

public class AlertRule {


    public long getMatchedRuleCount(String api) {
        return 5;
    }

    public long getMaxTps() {
        return 0;
    }

    public long getMaxErrorCount() {
        return 0;
    }
}
