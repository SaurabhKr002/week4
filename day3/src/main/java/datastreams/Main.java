package datastreams;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Saurabh Kumar", 3.8);
        Student student2 = new Student(102, "Kuldeep Chaturvedi", 3.5);

        // Writing student data to file
        StudentDataHandler.writeStudentData(student1);
        StudentDataHandler.writeStudentData(student2);

        // Reading student data from file
        StudentDataHandler.readStudentData();
    }
}
