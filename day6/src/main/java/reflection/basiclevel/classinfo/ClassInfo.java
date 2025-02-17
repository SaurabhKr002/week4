package reflection.basiclevel.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo {

    // Get field names of a class
    public static List<String> getFieldNames(Class<?> clazz) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }

    // Get method names of a class
    public static List<String> getMethodNames(Class<?> clazz) {
        List<String> methodNames = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            methodNames.add(method.getName());
        }
        return methodNames;
    }

    // Get constructor signatures of a class
    public static List<String> getConstructorSignatures(Class<?> clazz) {
        List<String> constructorSignatures = new ArrayList<>();
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            constructorSignatures.add(constructor.toString());
        }
        return constructorSignatures;
    }
}
