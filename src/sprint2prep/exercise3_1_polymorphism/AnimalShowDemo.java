package sprint2prep.exercise3_1_polymorphism;

/**
 * Runs the AnimalShow exercise.
 */
public class AnimalShowDemo {
    public static void main(String[] args) {
        System.out.println("Using instanceof and downcasting:");

        AnimalShowWithCasting castingShow = new AnimalShowWithCasting();

        castingShow.perform(new Dog("Buddy"));
        castingShow.perform(new Cat("Milo"));
        castingShow.perform(new Parrot("Polly"));
        castingShow.perform(new Animal("Mystery Animal"));

        System.out.println();
        System.out.println("Using polymorphism:");

        AnimalShow polymorphicShow = new AnimalShow();

        polymorphicShow.perform(new Dog("Buddy"));
        polymorphicShow.perform(new Cat("Milo"));
        polymorphicShow.perform(new Parrot("Polly"));
        polymorphicShow.perform(new Animal("Mystery Animal"));
    }
}
