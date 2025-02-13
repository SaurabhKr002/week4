package mapinterface.groupemployees;

import java.util.*;

public class GroupEmployees {
    // Method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }

        return grouped;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = groupByDepartment(employees);
        System.out.println("Grouped Employees: " + grouped);
    }
}