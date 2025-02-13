package hospitaltriagesystem;

import queueinterface.hospitaltriagesystem.HospitalTriage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalTriageTest {
    @Test
    void testTriageOrder() {
        HospitalTriage triage = new HospitalTriage();

        // Adding patients (Saurabh, Anand, Kuldeep)
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        // Checking treatment order
        assertEquals("Alice", triage.treatPatient());
        assertEquals("John", triage.treatPatient());
        assertEquals("Bob", triage.treatPatient());
        assertTrue(triage.isEmpty());
    }

    @Test
    void testEmptyTriage() {
        HospitalTriage triage = new HospitalTriage();
        assertEquals("No patients", triage.treatPatient());
    }
}
