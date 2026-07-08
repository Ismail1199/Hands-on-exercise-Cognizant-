public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        // Add Products
        inventory.addProduct(new Product(101, "Laptop", 10, 65000));
        inventory.addProduct(new Product(102, "Mouse", 50, 500));
        inventory.addProduct(new Product(103, "Keyboard", 25, 1200));

        // Display
        inventory.displayProducts();

        // Update Product
        inventory.updateProduct(102, "Wireless Mouse", 40, 750);

        // Delete Product
        inventory.deleteProduct(103);

        // Display
        inventory.displayProducts();
    }
}