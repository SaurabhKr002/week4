package smartwarehousemanagement;

// Subclass representing Groceries
class Groceries extends WarehouseItem {
    public Groceries(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
