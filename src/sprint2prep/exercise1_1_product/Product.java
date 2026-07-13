package sprint2prep.exercise1_1_product;

/**
 * Represents a product with a name, price, and stock count.
 */
public class Product {
    private String name;
    private double price;
    private int stockCount;

    /**
     * Creates a product with a name and price.
     * The stock count is set to 0 by default.
     *
     * @param name  the product name
     * @param price the product price
     */
    public Product(String name, double price) {
        this(name, price, 0);
    }

    /**
     * Creates a product with a name, price, and stock count.
     *
     * @param name       the product name
     * @param price      the product price
     * @param stockCount the number of products in stock
     */
    public Product(String name, double price, int stockCount) {
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }

    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name.
     *
     * @param name the new product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the product price.
     *
     * @return the product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the product price.
     *
     * @param price the new product price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the number of products in stock.
     *
     * @return the stock count
     */
    public int getStockCount() {
        return stockCount;
    }

    /**
     * Sets the number of products in stock.
     *
     * @param stockCount the new stock count
     */
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * Applies a discount to the product price and marks the product as on sale.
     *
     * @param discountPercentage the discount percentage to apply
     */
    public void applySale(double discountPercentage) {
        double currentPrice = getPrice();
        double discountedPrice = currentPrice - (currentPrice * discountPercentage / 100);

        setPrice(discountedPrice);
        setName(getName() + " - SALE");
    }

    /**
     * Reduces the stock count by one if the product is in stock.
     */
    public void sellOne() {
        int currentStock = getStockCount();

        if (currentStock > 0) {
            setStockCount(currentStock - 1);
        }
    }

    /**
     * Adds more stock if the current stock count is below the minimum stock level.
     *
     * @param minimumStock the minimum stock level before restocking
     * @param amountToAdd  the amount of stock to add
     */
    public void restockIfLow(int minimumStock, int amountToAdd) {
        int currentStock = getStockCount();

        if (currentStock < minimumStock) {
            setStockCount(currentStock + amountToAdd);
        }
    }

    /**
     * Returns a readable text version of the product.
     *
     * @return the product details as a string
     */
    @Override
    public String toString() {
        return "Product{name='" + getName() + "', price=" + getPrice() + ", stockCount=" + getStockCount() + "}";
    }
}