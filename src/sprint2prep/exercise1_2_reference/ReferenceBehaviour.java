package sprint2prep.exercise1_2_reference;

import sprint2prep.exercise1_1_product.Product;

/**
 * Demonstrates how object references work in Java.
 */
public class ReferenceBehaviour {
    public static void main(String[] args) {
        System.out.println("Reference example:");

        // p1 stores a reference to a new Product object.
        Product p1 = new Product("Laptop", 900);

        // p2 does not create a new Product object.
        // It copies the reference from p1, so both variables point to the same object.
        Product p2 = p1;

        // This changes the single Product object that both p1 and p2 refer to.
        p1.setPrice(1100);

        // Both prices are 1100.0 because p1 and p2 point to the same object.
        System.out.println("p1 price: " + p1.getPrice());
        System.out.println("p2 price: " + p2.getPrice());

        System.out.println();
        System.out.println("Separate object example:");

        // p3 refers to one Product object.
        Product p3 = new Product("Laptop", 900);

        // p4 refers to a different Product object because we used new again.
        Product p4 = new Product("Laptop", 900);

        // This only changes the object that p4 points to.
        p4.setPrice(1100);

        // p3 stays 900.0, but p4 becomes 1100.0 because they are separate objects.
        System.out.println("p3 price: " + p3.getPrice());
        System.out.println("p4 price: " + p4.getPrice());
    }
}
