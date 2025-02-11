package resumescreening;

// Represents a Software Engineer job role
public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String experienceLevel) {
        super(candidateName, experienceLevel);
    }

    @Override
    public String getJobDescription() {
        return "Software Engineer: Requires strong programming skills and system design knowledge.";
    }
}
