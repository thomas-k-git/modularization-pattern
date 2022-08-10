public class PersistenceFlagsContributor implements FeatureFlagContributor {
    public static final String PERSISTENCE = "Persistence";

    @Override
    public void contribute(FeatureFlagService service) {
        service.register(PERSISTENCE);
    }
}
