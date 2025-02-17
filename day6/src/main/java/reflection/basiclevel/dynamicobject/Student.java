package reflection.basiclevel.dynamicobject;

public class Student {
    private String name;
    private int age;

    // Default constructor (Required for Reflection)
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}
