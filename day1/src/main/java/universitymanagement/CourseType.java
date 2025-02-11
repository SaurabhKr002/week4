package universitymanagement;

// Abstract base class representing different types of courses
public abstract class CourseType {
    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Abstract method to define evaluation type
    public abstract String getEvaluationMethod();
}
