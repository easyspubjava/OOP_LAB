package solid.ocp.after;

public class ApiStateInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long duration;
    private long timeCount;

    public String getApi() {
        return api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public long getDuration() {
        return duration;
    }

    public long getTimeCount() {
        return timeCount;
    }
}
