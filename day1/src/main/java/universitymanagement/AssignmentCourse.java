package universitymanagement;

// Assignment-based course extending CourseType
public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}
