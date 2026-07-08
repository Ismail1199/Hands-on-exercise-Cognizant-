import java.util.HashMap;

public class InventoryManagement {
    private HashMap<Integer, Product> inventory = new HashMap<>();
    // Add Product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists!");
            return;
        }
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }
    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }
    // Delete Product
    public void deleteProduct(int id) {
        if (inventory.remove(id) != null)
            System.out.println("Product Deleted Successfully.");
        else
            System.out.println("Product Not Found.");
    }
    // Display Products
    public void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }
        System.out.println("\n----- Inventory -----");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}