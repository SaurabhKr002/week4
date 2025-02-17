package annotations.practiceproblems.advancedlevel.customserialization;

// User class with annotated fields for JSON serialization
public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String password; // Not annotated, so it won't be serialized

    public User(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}
