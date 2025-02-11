package resumescreening;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ResumeScreeningTest {
    private SoftwareEngineer se;
    private DataScientist ds;
    private ProductManager pm;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        se = new SoftwareEngineer("Anand Kumar", "5 years");
        ds = new DataScientist("Saurabh Kumar", "3 years");
        pm = new ProductManager("Kuldeep Chaturvedi", "7 years");
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testJobRoleDescriptions() {
        assertEquals("Software Engineer: Requires strong programming skills and system design knowledge.", se.getJobDescription());
        assertEquals("Data Scientist: Requires expertise in machine learning, statistics, and data analysis.", ds.getJobDescription());
        assertEquals("Product Manager: Focuses on strategy, roadmap, and execution of product development.", pm.getJobDescription());
    }

    @Test
    void testResumeProcessing() {
        Resume<SoftwareEngineer> seResume = new Resume<>(se);
        seResume.processResume();
        assertTrue(outputStream.toString().contains("Processing Resume: Candidate: Anand Kumar, Experience: 5 years"));

        outputStream.reset();
        Resume<DataScientist> dsResume = new Resume<>(ds);
        dsResume.processResume();
        assertTrue(outputStream.toString().contains("Processing Resume: Candidate: Saurabh Kumar, Experience: 3 years"));
    }

    @Test
    void testResumeProcessor() {
        List<JobRole> resumes = Arrays.asList(se, ds, pm);
        ResumeProcessor.processMultipleResumes(resumes);

        String output = outputStream.toString();
        assertTrue(output.contains("Processing Multiple Resumes:"));
        assertTrue(output.contains("Candidate: Anand Kumar, Experience: 5 years"));
        assertTrue(output.contains("Candidate: Saurabh Kumar, Experience: 3 years"));
        assertTrue(output.contains("Candidate: Kuldeep Chaturvedi, Experience: 7 years"));
        assertTrue(output.contains("Status: Screening Complete"));
    }
}
