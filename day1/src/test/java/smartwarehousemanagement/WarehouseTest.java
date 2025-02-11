package smartwarehousemanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class WarehouseTest {

    @Test
    void testWarehouseItemCreation() {
        Electronics laptop = new Electronics("Laptop", 2.5);
        Furniture chair = new Furniture("Chair", 5.0);
        Groceries rice = new Groceries("Rice", 1.0);

        assertEquals("Laptop", laptop.getName());
        assertEquals(2.5, laptop.getWeight());
        assertEquals("Electronics", laptop.getCategory());

        assertEquals("Chair", chair.getName());
        assertEquals(5.0, chair.getWeight());
        assertEquals("Furniture", chair.getCategory());

        assertEquals("Rice", rice.getName());
        assertEquals(1.0, rice.getWeight());
        assertEquals("Groceries", rice.getCategory());
    }

    @Test
    void testStorageOperations() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics laptop = new Electronics("Laptop", 2.5);
        electronicsStorage.addItem(laptop);

        List<Electronics> items = electronicsStorage.getItems();
        assertEquals(1, items.size());
        assertEquals("Laptop", items.get(0).getName());
    }
}
