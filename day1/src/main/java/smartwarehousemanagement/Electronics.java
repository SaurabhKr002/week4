package smartwarehousemanagement;

// Subclass representing Electronics
class Electronics extends WarehouseItem {
    public Electronics(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
