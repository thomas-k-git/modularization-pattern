public interface FeatureFlagService {
    void register(String id);

    boolean isEnabled(String id);
}
