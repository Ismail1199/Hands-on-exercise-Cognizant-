package DSA.Exercise5;

public class Main {
    public static void main(String[] args) {
        TaskManagementSystem system = new TaskManagementSystem();

        system.addTask(new Task(101, "Design Database", "Pending"));
        system.addTask(new Task(102, "Develop API", "In Progress"));
        system.addTask(new Task(103, "Testing", "Pending"));

        System.out.println("All Tasks");

        system.traverseTasks();

        System.out.println("\nSearching Task");

        System.out.println(system.searchTask(102));

        System.out.println();

        system.deleteTask(102);

        System.out.println("\nTasks After Deletion");

        system.traverseTasks();
    }
}