package sprint2prep.exercise3_1_polymorphism;

/**
 * Runs performances using instanceof and downcasting.
 * This version shows the less flexible approach.
 */
public class AnimalShowWithCasting {
    /**
     * Performs an animal act using instanceof and downcasting.
     *
     * @param animal the animal that should perform
     */
    public void perform(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        } else {
            System.out.println(animal.getName() + " performs in a simple way.");
        }
    }
}