package resumescreening;

// Abstract class representing a Job Role
public abstract class JobRole {
    protected String candidateName;
    protected String experienceLevel;

    public JobRole(String candidateName, String experienceLevel) {
        this.candidateName = candidateName;
        this.experienceLevel = experienceLevel;
    }

    public abstract String getJobDescription();

    @Override
    public String toString() {
        return "Candidate: " + candidateName + ", Experience: " + experienceLevel;
    }
}
