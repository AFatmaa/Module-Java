/**
 * Represents a parrot.
 */
public class Parrot extends Animal {

    /**
     * Creates a parrot with a name.
     *
     * @param name the parrot's name
     */
    public Parrot(String name) {
        super(name);
    }

    /**
     * Makes the parrot squawk.
     */
    public void squawk() {
        System.out.println(getName() + " says squawk!");
    }

    /**
     * Performs the parrot's animal show act.
     */
    @Override
    public void perform() {
        squawk();
    }
}
