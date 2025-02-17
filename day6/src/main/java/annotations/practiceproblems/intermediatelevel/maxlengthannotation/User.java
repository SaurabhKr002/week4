package annotations.practiceproblems.intermediatelevel.maxlengthannotation;

import java.lang.reflect.Field;

// User class with @MaxLength annotation validation
public class User {

    @MaxLength(10) // Username should not exceed 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(this, username);
        this.username = username;
    }

    // Method to validate field length using reflection
    private void validateMaxLength(Object obj, String value) {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (value.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Field '" + field.getName() +
                            "' exceeds max length of " + maxLength.value());
                }
            }
        }
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
}
