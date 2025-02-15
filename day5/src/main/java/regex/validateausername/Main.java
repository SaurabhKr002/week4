package regex.validateausername;

import static regex.validateausername.UsernameValidator.isValidUsername;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123")); // true
        System.out.println(isValidUsername("123user")); // false
        System.out.println(isValidUsername("us"));      // false
    }
}
