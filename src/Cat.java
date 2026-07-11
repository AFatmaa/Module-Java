/**
 * Represents a cat.
 */
public class Cat extends Animal {
    /**
     * Creates a cat with a name.
     *
     * @param name the cat's name
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Makes the cat meow.
     */
    public void meow() {
        System.out.println(getName() + " says meow!");
    }

    /**
     * Performs the cat's animal show act.
     */
    @Override
    public void perform() {
        meow();
    }
}
