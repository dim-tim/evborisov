package quotes;

/**
 * Created by dima on 13.12.14.
 */
public class ProfilingController implements ProfilingControllerMBean{
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
