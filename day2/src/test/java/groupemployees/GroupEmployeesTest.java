// JUnit test for GroupEmployees
package groupemployees;

import static org.junit.jupiter.api.Assertions.*;

import mapinterface.groupemployees.Employee;
import mapinterface.groupemployees.GroupEmployees;
import org.junit.jupiter.api.Test;
import java.util.*;

class GroupEmployeesTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expected = new HashMap<>();
        expected.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expected.put("IT", Collections.singletonList(new Employee("Bob", "IT")));

        Map<String, List<Employee>> result = GroupEmployees.groupByDepartment(employees);
        assertEquals(expected.keySet(), result.keySet());

        assertEquals(expected.get("HR").size(), result.get("HR").size());
        assertEquals(expected.get("IT").size(), result.get("IT").size());
    }

    @Test
    void testEmptyEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        assertTrue(GroupEmployees.groupByDepartment(employees).isEmpty());
    }

    @Test
    void testSingleDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> result = GroupEmployees.groupByDepartment(employees);
        assertEquals(1, result.size());
        assertEquals(2, result.get("HR").size());
    }
}
