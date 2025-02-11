package universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating different course types
        ExamCourse math = new ExamCourse("Mathematics");
        AssignmentCourse cs = new AssignmentCourse("Computer Science");
        ResearchCourse physics = new ResearchCourse("Quantum Physics");

        // Creating course management instances
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding courses to respective categories
        examCourses.addCourse(math);
        assignmentCourses.addCourse(cs);
        researchCourses.addCourse(physics);

        // Combining all courses into a single list for wildcard method
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math);
        allCourses.add(cs);
        allCourses.add(physics);

        // Displaying all courses using the wildcard method
        System.out.println("University Course Management System");
        System.out.println("Managed by Dr. Anand, Professor Saurabh, Dr. Kuldeep");
        System.out.println("------------------------------------------------------");
        Course.displayCourses(allCourses);
    }
}
