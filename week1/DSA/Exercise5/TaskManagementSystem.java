package DSA.Exercise5;

public class TaskManagementSystem {
    private Task head;

    // Add Task
    public void addTask(Task task) {
        if (head == null) {
            head = task;
            return;
        }
        Task temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = task;
    }

    // Search Task
    public Task searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.getTaskId() == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Traverse Tasks
    public void traverseTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {
        if (head == null)
            return;
        if (head.getTaskId() == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }
        Task temp = head;
        while (temp.next != null && temp.next.getTaskId() != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Task Deleted Successfully.");
        } else {
            System.out.println("Task Not Found.");
        }
    }
}