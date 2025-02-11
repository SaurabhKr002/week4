package universitymanagement;

// Exam-based course extending CourseType
public class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}
