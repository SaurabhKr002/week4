package reflection.basiclevel.privatefield;

public class Person {
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Public method to retrieve age (for comparison)
    public int getAge() {
        return age;
    }
}
