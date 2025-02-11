package resumescreening;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("AI-Driven Resume Screening System");
        System.out.println("---------------------------------");

        // Creating individual resumes
        SoftwareEngineer se = new SoftwareEngineer("Anand Kumar", "5 years");
        DataScientist ds = new DataScientist("Saurabh Kumar", "3 years");
        ProductManager pm = new ProductManager("Kuldeep Chaturvedi", "7 years");

        // Processing individual resumes
        Resume<SoftwareEngineer> seResume = new Resume<>(se);
        seResume.processResume();

        Resume<DataScientist> dsResume = new Resume<>(ds);
        dsResume.processResume();

        Resume<ProductManager> pmResume = new Resume<>(pm);
        pmResume.processResume();

        // Processing multiple resumes using wildcards
        ResumeProcessor.processMultipleResumes(Arrays.asList(se, ds, pm));
    }
}
