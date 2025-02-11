package universitymanagement;

import java.util.ArrayList;
import java.util.List;

// Generic class for managing different types of courses
public class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    // Method to add a course to the list
    public void addCourse(T course) {
        courseList.add(course);
    }

    // Method using wildcard to display courses dynamically
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("List of Courses:");
        for (CourseType course : courses) {
            System.out.println(course.getCourseName() + " - " + course.getEvaluationMethod());
        }
    }

    // Getter to retrieve the stored courses
    public List<T> getCourses() {
        return courseList;
    }
}
