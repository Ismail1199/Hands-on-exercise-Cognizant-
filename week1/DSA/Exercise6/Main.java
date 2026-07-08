package DSA.Exercise6;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "C Programming", "Dennis Ritchie"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Java Programming", "James Gosling"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Python Basics", "Guido van Rossum")
        };
        String searchTitle = "Java Programming";

        System.out.println("Linear Search");

        Book linearResult = LibraryManagementSystem.linearSearch(books, searchTitle);

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Book Not Found");

        System.out.println();

        System.out.println("Binary Search");

        Book binaryResult = LibraryManagementSystem.binarySearch(books, searchTitle);

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Book Not Found");
    }
}