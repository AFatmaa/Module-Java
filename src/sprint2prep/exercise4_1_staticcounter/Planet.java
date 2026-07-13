package sprint2prep.exercise4_1_staticcounter;

/**
 * Represents a planet and counts how many Planet objects have been created.
 */
public class Planet {
    private String name;
    private static int planetCount = 0;

    /**
     * Creates a planet with a name and increases the shared planet count.
     *
     * @param name the planet name
     */
    public Planet(String name) {
        this.name = name;
        planetCount++;
    }

    /**
     * Gets the planet name.
     *
     * @return the planet name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of Planet objects created.
     *
     * @return the shared planet count
     */
    public static int getPlanetCount() {
        return planetCount;

        // This method is static, so it belongs to yhe class, not one object.
        // That is why we cannot directly use the instance field "name" here.
        // Example: return name; // This would cause an error.
    }


}
