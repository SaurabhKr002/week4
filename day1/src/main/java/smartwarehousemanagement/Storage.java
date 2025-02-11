package smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

// Generic storage class for managing warehouse items
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getCategory() + " - " + item.getName() + ", Weight: " + item.getWeight() + "kg");
        }
    }
}
