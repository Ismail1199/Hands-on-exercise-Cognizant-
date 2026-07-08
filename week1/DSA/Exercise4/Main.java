package DSA.Exercise4;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        system.addEmployee(new Employee(101, "Alice", "Manager", 65000));
        system.addEmployee(new Employee(102, "Bob", "Developer", 50000));
        system.addEmployee(new Employee(103, "Charlie", "Tester", 45000));

        system.traverseEmployees();

        System.out.println("\nSearching Employee 102");
        System.out.println(system.searchEmployee(102));

        system.deleteEmployee(102);

        system.traverseEmployees();
    }
}