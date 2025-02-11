package universitymanagement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class CourseTest {
    private ExamCourse math;
    private AssignmentCourse cs;
    private ResearchCourse physics;
    private Course<ExamCourse> examCourses;
    private Course<AssignmentCourse> assignmentCourses;
    private Course<ResearchCourse> researchCourses;

    @BeforeEach
    void setUp() {
        math = new ExamCourse("Mathematics");
        cs = new AssignmentCourse("Computer Science");
        physics = new ResearchCourse("Quantum Physics");

        examCourses = new Course<>();
        assignmentCourses = new Course<>();
        researchCourses = new Course<>();
    }

    @Test
    void testExamCourseEvaluationMethod() {
        assertEquals("Exam-Based Evaluation", math.getEvaluationMethod());
    }

    @Test
    void testAssignmentCourseEvaluationMethod() {
        assertEquals("Assignment-Based Evaluation", cs.getEvaluationMethod());
    }

    @Test
    void testResearchCourseEvaluationMethod() {
        assertEquals("Research-Based Evaluation", physics.getEvaluationMethod());
    }

    @Test
    void testAddCourse() {
        examCourses.addCourse(math);
        assignmentCourses.addCourse(cs);
        researchCourses.addCourse(physics);

        assertEquals(1, examCourses.getCourses().size());
        assertEquals(1, assignmentCourses.getCourses().size());
        assertEquals(1, researchCourses.getCourses().size());
    }

    @Test
    void testDisplayCourses() {
        examCourses.addCourse(math);
        assignmentCourses.addCourse(cs);
        researchCourses.addCourse(physics);

        List<CourseType> allCourses = List.of(math, cs, physics);
        assertDoesNotThrow(() -> Course.displayCourses(allCourses));
    }
}
