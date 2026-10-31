import javax.swing.JOptionPane;

public class InventoryApp {
    public static void main(String[] args) {

        // Create three products with names, prices, and quantities
        Product product1 = new Product("Xbox Controller", 59.99, 10);
        Product product2 = new Product("Controller Charging Station", 49.99, 5);
        Product product3 = new Product("Wireless Headset", 79.99, 8);

        // Calculate the inventory value for each product
        double value1 = product1.calculateInventoryValue();
        double value2 = product2.calculateInventoryValue();
        double value3 = product3.calculateInventoryValue();

        // Calculate the total inventory value
        double total = value1 + value2 + value3;

        // Display product details and values in the console
        System.out.println("--- Electronics Store Inventory ---");

        System.out.println("\nProduct: " + product1.getName());
        System.out.printf("Price: $%.2f%n", product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());
        System.out.printf("Inventory Value: $%.2f%n", value1);

        System.out.println("\nProduct: " + product2.getName());
        System.out.printf("Price: $%.2f%n", product2.getPrice());
        System.out.println("Quantity: " + product2.getQuantity());
        System.out.printf("Inventory Value: $%.2f%n", value2);

        System.out.println("\nProduct: " + product3.getName());
        System.out.printf("Price: $%.2f%n", product3.getPrice());
        System.out.println("Quantity: " + product3.getQuantity());
        System.out.printf("Inventory Value: $%.2f%n", value3);

        // Display the combined inventory value
        System.out.println("\n------------------------------");
        System.out.printf("Total Inventory Value: $%.2f%n", total);

        // Create a GUI popup showing the inventory summary
        JOptionPane.showMessageDialog(
            null,
            String.format(
                "Electronics Store Inventory\n\n" +
                "%s: $%.2f\n" +
                "%s: $%.2f\n" +
                "%s: $%.2f\n\n" +
                "Total Inventory Value: $%.2f",
                product1.getName(), value1,
                product2.getName(), value2,
                product3.getName(), value3,
                total
            ),
            "Inventory Summary",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
