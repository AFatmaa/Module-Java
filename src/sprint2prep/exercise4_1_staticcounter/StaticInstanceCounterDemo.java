package sprint2prep.exercise4_1_staticcounter;

/**
 * Runs the static instance counter exercise.
 */
public class StaticInstanceCounterDemo {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");

        System.out.println("Created Planets:");
        System.out.println(earth.getName());
        System.out.println(mars.getName());
        System.out.println(jupiter.getName());

        System.out.println();
        System.out.println("Planet count using the class name:");
        System.out.println(Planet.getPlanetCount());

        System.out.println();
        System.out.println("Planet count using an object reference:");
        System.out.println(earth.getPlanetCount());
    }
}
