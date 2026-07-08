package DSA.Exercise4;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;
    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            System.out.println("Employee array is full.");
            return;
        }
        employees[count++] = employee;
        System.out.println("Employee added successfully.");
    }

    // Search Employee
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id)
                return employees[i];
        }
        return null;
    }

    // Traverse Employees
    public void traverseEmployees() {
        System.out.println("\nEmployee Records");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}