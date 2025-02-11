package resumescreening;

// Represents a Data Scientist job role
public class DataScientist extends JobRole {
    public DataScientist(String candidateName, String experienceLevel) {
        super(candidateName, experienceLevel);
    }

    @Override
    public String getJobDescription() {
        return "Data Scientist: Requires expertise in machine learning, statistics, and data analysis.";
    }
}
