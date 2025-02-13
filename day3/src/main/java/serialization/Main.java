package serialization;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 70000));
        employees.add(new Employee(3, "Carol", "Finance", 60000));

        // Save employees to file
        EmployeeManager.saveEmployees(employees);

        // Load employees from file
        List<Employee> loadedEmployees = EmployeeManager.loadEmployees();
        System.out.println("Loaded Employees:");
        for (Employee emp : loadedEmployees) {
            System.out.println(emp);
        }
    }
}
