package dynamicmarketplace;

// Represents a clothing category
class ClothingCategory implements ProductCategory {
    private String categoryName;

    public ClothingCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}
