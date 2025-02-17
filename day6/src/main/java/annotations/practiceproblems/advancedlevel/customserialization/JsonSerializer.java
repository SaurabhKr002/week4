package annotations.practiceproblems.advancedlevel.customserialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Class responsible for converting objects to JSON
public class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {
        Map<String, String> jsonMap = new HashMap<>();
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true); // Allow access to private fields

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), field.get(obj).toString());
            }
        }

        return jsonMap.toString().replace("=", ": "); // Convert map to JSON string format
    }
}
