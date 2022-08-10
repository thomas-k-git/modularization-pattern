public class MonitoringFlagsContributor implements FeatureFlagContributor {
    public static final String FLAG = "Monitoring";

    @Override
    public void contribute(FeatureFlagService service) {
        service.register(FLAG);
    }
}
