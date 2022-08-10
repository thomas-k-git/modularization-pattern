public class MonitoringImpl {
    private final FeatureFlagService service;

    public MonitoringImpl(FeatureFlagService service) {
        this.service = service;
    }

    public void monitor() {
        if (this.service.isEnabled(MonitoringFlagsContributor.FLAG)) {
            System.out.println("Monitoring enabled");
        } else {
            System.out.println("Monitoring disabled");
        }
    }
}
