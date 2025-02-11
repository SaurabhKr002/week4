package smartwarehousemanagement;

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 2.5));
        electronicsStorage.addItem(new Electronics("Smartphone", 0.3));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 1.0));
        groceriesStorage.addItem(new Groceries("Milk", 0.5));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 5.0));
        furnitureStorage.addItem(new Furniture("Table", 10.0));

        System.out.println("Electronics Storage:");
        Storage.displayItems(electronicsStorage.getItems());
        System.out.println("\nGroceries Storage:");
        Storage.displayItems(groceriesStorage.getItems());
        System.out.println("\nFurniture Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}