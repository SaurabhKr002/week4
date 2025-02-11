package resumescreening;

import java.util.List;

// Class to process multiple resumes using wildcard
public class ResumeProcessor {

    // Method to process a list of resumes of any job role
    public static void processMultipleResumes(List<? extends JobRole> resumes) {
        System.out.println("Processing Multiple Resumes:\n-----------------------------");
        for (JobRole resume : resumes) {
            System.out.println(resume);
            System.out.println("Job Description: " + resume.getJobDescription());
            System.out.println("Status: Screening Complete\n");
        }
    }
}
