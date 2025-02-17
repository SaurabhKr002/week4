package reflection.basiclevel.dynamicobject;

public class ObjectCreator {
    public static void main(String[] args) {
        try {
            // Dynamically create an instance of Student using Reflection
            Class<?> studentClass = Class.forName("reflection.basiclevel.dynamicobject.Student");
            Object studentInstance = studentClass.getDeclaredConstructor().newInstance();

            // Invoke method using Reflection
            studentClass.getMethod("displayInfo").invoke(studentInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
