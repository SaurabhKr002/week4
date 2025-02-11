package resumescreening;

// Generic class for processing resumes
public class Resume<T extends JobRole> {
    private final T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Process the resume for a specific job role
    public void processResume() {
        System.out.println("Processing Resume: " + jobRole);
        System.out.println("Job Description: " + jobRole.getJobDescription());
        System.out.println("Status: Screening in Progress...\n");
    }
}
