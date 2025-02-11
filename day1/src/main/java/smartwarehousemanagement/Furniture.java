package smartwarehousemanagement;

// Subclass representing Furniture
class Furniture extends WarehouseItem {
    public Furniture(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
