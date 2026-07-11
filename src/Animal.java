/**
 * Represents a general animal with a name.
 */
public class Animal {
    private String name;

    /**
     * Creates an animal with a name.
     *
     * @param name the animal's name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Gets the animal's name.
     *
     * @return the animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * Performs a default animal act.
     */
    public void perform() {
        System.out.println(getName() + " performs in a simple way.");
    }
}
