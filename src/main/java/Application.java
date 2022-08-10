public class Application {
    public static void main(String[] args) {
        FeatureFlagServiceImpl ff = new FeatureFlagServiceImpl();
        ff.init();

        MonitoringImpl monitoring = new MonitoringImpl(ff);
        // disabled
        monitoring.monitor();

        // just for DEMO purposes, assume a UI module executes
        ff.setEnabled(MonitoringFlagsContributor.FLAG, Boolean.TRUE);
        // -- end DEMO purposes

        // enabled
        monitoring.monitor();
    }
}
