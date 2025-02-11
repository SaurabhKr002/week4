package dynamicmarketplace;

// Represents a gadget category
class GadgetCategory implements ProductCategory {
    private String categoryName;

    public GadgetCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}
