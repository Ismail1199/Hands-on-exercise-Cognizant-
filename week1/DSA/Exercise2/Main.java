package DSA.Exercise2;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };
        int searchId = 103;
        System.out.println("===== Linear Search =====");
        Product linearResult = SearchOperations.linearSearch(products, searchId);
        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product Not Found");
        System.out.println();
        System.out.println("===== Binary Search =====");
        Product binaryResult = SearchOperations.binarySearch(products, searchId);
        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product Not Found");
    }
}