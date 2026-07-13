package sprint2prep.exercise4_2_finalsafety;

/**
 * Demonstrates final fields and class constants.
 */
public class Configuration {
    public static final int MAX_USERS = 100;

    private final String systemName;

    /**
     * Creates a configuration with a system name.
     *
     * @param systemName the name of the system
     */
    public Configuration(String systemName) {
        this.systemName = systemName;
    }

    /**
     * Gets the system name.
     *
     * @return the system name
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * This setter would not compile because systemName is final.
     * A final field can be assigned once, usually in the constructor.
     */
    // public  void setSystemName(String systemName) {
    //     this.systemName = systemName;
    // }
}
