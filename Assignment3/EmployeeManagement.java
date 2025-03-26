import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize Employee objects
    public Employee(int id, String name, double salary) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println(String.format("Employee ID: %d", id));
        System.out.println(String.format("Employee Name: %s", name));
        System.out.println(String.format("Employee Salary: %.2f", salary));
        System.out.println("--------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        try {
            // 1. Create at least 3 Employee objects
            Employee employee1 = new Employee(101, "Hemant Singh", 50000.0);
            Employee employee2 = new Employee(102, "Arush Katiyar", 60000.0);
            Employee employee3 = new Employee(103, "Nitish Singh", 75000.0);

            // 2. Store them in a list
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee1);
            employeeList.add(employee2);
            employeeList.add(employee3);

            // 3. Display their details
            System.out.println("Employee Details:");
            for (Employee employee : employeeList) {
                employee.displayDetails();
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating employee: " + e.getMessage());
        }
    }
}