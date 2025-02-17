package reflection.basiclevel.classinfo;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfoTest {

    @Test
    void testGetFieldNames() {
        List<String> fields = ClassInfo.getFieldNames(TestClass.class);
        assertTrue(fields.contains("privateField"));
        assertTrue(fields.contains("publicField"));
    }

    @Test
    void testGetMethodNames() {
        List<String> methods = ClassInfo.getMethodNames(TestClass.class);
        assertTrue(methods.contains("getPrivateField"));
        assertTrue(methods.contains("setPrivateField"));
        assertTrue(methods.contains("publicMethod"));
    }

    @Test
    void testGetConstructorSignatures() {
        List<String> constructors = ClassInfo.getConstructorSignatures(TestClass.class);
        assertEquals(2, constructors.size()); // Should have a default and parameterized constructor
    }
}
