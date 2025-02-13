package serialization;

import java.io.*;
import java.util.*;

class EmployeeManager {
    private static final String FILE_PATH = "D:\\Capg\\week4\\day3\\src\\main\\java\\serialization\\Employee_Info.ser";

    // Saves the list of employees to a file using ObjectOutputStream
    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    // Loads the list of employees from a file using ObjectInputStream
    @SuppressWarnings("unchecked")
    public static List<Employee> loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
