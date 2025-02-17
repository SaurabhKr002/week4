package annotations.practiceproblems.advancedlevel.rolebasedaccesscontrol;

import java.lang.reflect.Method;

// Service class with role-based access control
public class SecureService {

    // Restricted method - only accessible to ADMIN
    @RoleAllowed("ADMIN")
    public void performAdminTask(User user) {
        if (hasAccess(user, "performAdminTask")) {
            System.out.println("Admin task executed successfully!");
        } else {
            System.out.println("Access Denied!");
        }
    }

    // Role validation using reflection
    private boolean hasAccess(User user, String methodName) {
        try {
            Method method = this.getClass().getMethod(methodName, User.class);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                return user.getRole().equals(roleAllowed.value()); // Check if user role matches required role
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }
}
