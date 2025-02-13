package serialization;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class EmployeeManagerTest {

    @Test
    void testSerializationAndDeserialization() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 70000));

        EmployeeManager.saveEmployees(employees);
        List<Employee> loadedEmployees = EmployeeManager.loadEmployees();

        assertNotNull(loadedEmployees, "Loaded employees should not be null.");
        assertEquals(2, loadedEmployees.size(), "There should be two employees.");
        assertEquals("'Alice'", loadedEmployees.get(0).toString().split(",")[1].trim().split("=")[1], "First employee should be Alice.");
    }
}
