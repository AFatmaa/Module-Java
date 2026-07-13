package sprint2prep.exercise4_2_finalsafety;

/**
 * Represents a polygon with a fixed number of sides.
 */
public class Polygon {
    private final int numberOfSides;

    /**
     * This constructor would not compile because numberOfSides is final
     * and must be initialized before the object is fully created.
     */
    //  public Polygon() {
    //
    //  }

    /**
     * Creates a polygon with a fixed number of sides.
     *
     * @param numberOfSides the number of sides
     */
    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    /**
     * Gets the number of sides.
     *
     * @return the number of sides
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * Describes the polygon.
     * This method is final, so subclasses cannot override it.
     */
    public final void describe() {
        System.out.println("I am a polygon with " + numberOfSides + " sides.");
    }

    /**
     * This setter would not compile because numberOfSides is final.
     * A final field cannot be reassigned after construction.
     */
    //  public void setNumberOfSides(int numberOfSides) {
    //      this.numberOfSides = numberOfSides;
    //  }
}
