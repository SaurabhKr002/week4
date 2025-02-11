package resumescreening;

// Represents a Product Manager job role
public class ProductManager extends JobRole {
    public ProductManager(String candidateName, String experienceLevel) {
        super(candidateName, experienceLevel);
    }

    @Override
    public String getJobDescription() {
        return "Product Manager: Focuses on strategy, roadmap, and execution of product development.";
    }
}
