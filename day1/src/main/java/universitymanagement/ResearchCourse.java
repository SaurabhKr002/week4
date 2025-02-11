package universitymanagement;

// Research-based course extending CourseType
public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}
