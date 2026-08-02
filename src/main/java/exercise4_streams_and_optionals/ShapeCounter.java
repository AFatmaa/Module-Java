package exercise4_streams_and_optionals;

import java.util.Map;

public class ShapeCounter {

    /**
     * Counts how many shapes have the given number of sides.
     *
     * @param shapesToSides a map of shape names to their number of sides
     * @param numberOfSides the number of sides to search for
     * @return the number of matching shapes
     */
    public long countShapesWithSides(Map<String, Integer> shapesToSides, int numberOfSides) {

        return shapesToSides.entrySet().stream()
                .filter(entry -> entry.getValue() == numberOfSides)
                .count();
    }

    public static void main(String[] args) {

        Map<String, Integer> shapes = Map.of(
                "Triangle", 3,
                "Square", 4,
                "Rectangle", 4,
                "Pentagon", 5,
                "Rhombus", 4
        );

        ShapeCounter shapeCounter = new ShapeCounter();
        System.out.println(shapeCounter.countShapesWithSides(shapes, 4));
    }
}