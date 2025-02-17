package reflection.basiclevel.classinfo;

public class TestClass {
    private String privateField;
    public int publicField;

    // Default constructor
    public TestClass() {}

    // Parameterized constructor
    public TestClass(String privateField) {
        this.privateField = privateField;
    }

    // Getter and Setter
    public String getPrivateField() { return privateField; }
    public void setPrivateField(String privateField) { this.privateField = privateField; }

    // Public method
    public void publicMethod() {}
}
