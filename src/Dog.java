/**
 * Represents a dog.
 */
public class Dog extends Animal {
    /**
     * Creates a dog with a name.
     *
     * @param name the dog's name
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Makes the dog bark.
     */
    public void bark() {
        System.out.println(getName() + " says woof!");
    }

    /**
     * Performs the dog's animal show act.
     */
    @Override
    public void perform() {
        bark();
    }
}
