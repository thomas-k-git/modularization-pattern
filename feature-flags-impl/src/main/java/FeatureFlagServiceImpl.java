import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

public class FeatureFlagServiceImpl implements FeatureFlagService {
    public static final Boolean DEFAULT = Boolean.FALSE;

    private final Map<String, Boolean> ids = new HashMap<>();

    public void init() {
        for (FeatureFlagContributor contrib : ServiceLoader.load(FeatureFlagContributor.class)) {
            contrib.contribute(this);
        }
        System.out.println("Loaded flags: " + ids.keySet());
    }

    @Override
    public void register(String id) {
        ids.put(id, DEFAULT);
    }

    @Override
    public boolean isEnabled(String id) {
        return ids.get(id);
    }

    /**
     * To be called be UI..
     */
    public void setEnabled(String id, Boolean value) {
        ids.put(id, value);
    }

    /**
     * Called by UI to show list
     */
    public Set<String> getIds() {
        return ids.keySet();
    }
}
