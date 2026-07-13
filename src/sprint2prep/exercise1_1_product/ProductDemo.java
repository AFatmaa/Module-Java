package sprint2prep.exercise1_1_product;

public class ProductDemo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 900.00);
        Product phone = new Product("Phone", 500.00, 10);
        Product book = new Product("Book", 15.50, 25);

        System.out.println("Original products:");
        System.out.println(laptop);
        System.out.println(phone);
        System.out.println(book);

        laptop.applySale(10);
        laptop.restockIfLow(5, 20);
        phone.sellOne();

        System.out.println();
        System.out.println("After shop updates:");
        System.out.println(laptop);
        System.out.println(phone);
        System.out.println(book);
    }
}