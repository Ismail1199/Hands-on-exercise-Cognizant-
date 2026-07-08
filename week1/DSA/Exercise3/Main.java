package DSA.Exercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders1 = {
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 1500),
                new Order(103, "Charlie", 8000),
                new Order(104, "David", 3000)
        };

        Order[] orders2 = {
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 1500),
                new Order(103, "Charlie", 8000),
                new Order(104, "David", 3000)
        };

        System.out.println("Original Orders");
        SortOperations.display(orders1);

        System.out.println("Bubble Sort");
        SortOperations.bubbleSort(orders1);
        SortOperations.display(orders1);

        System.out.println("Quick Sort");
        SortOperations.quickSort(orders2, 0, orders2.length - 1);
        SortOperations.display(orders2);

    }
}