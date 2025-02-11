package dynamicmarketplace;

// Represents a book category
class BookCategory implements ProductCategory {
    private String categoryName;

    public BookCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}
