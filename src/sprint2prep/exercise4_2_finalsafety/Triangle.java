package sprint2prep.exercise4_2_finalsafety;

/**
 * Represents a triangle.
 */
public class Triangle extends Polygon {
    /**
     * Creates a triangle with 3 sides.
     */
    public Triangle() {
        super(3);
    }

    /**
     * This would not compile because describe() is final in Polygon.
     */
    //  @Override
    //  public void describe() {
    //     System.out.println("I am a triangle.");
    //  }
}
