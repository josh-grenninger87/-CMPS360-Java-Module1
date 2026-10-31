
public class Product {

    // Private attributes for each product
    private String name;
    private double price;
    private int quantity;

    // Constructor initializes the product information
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate the total inventory value of a product
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Return the product's name
    public String getName() {
        return name;
    }

    // Return the product's price
    public double getPrice() {
        return price;
    }

    // Return the product's quantity
    public int getQuantity() {
        return quantity;
    }
}
