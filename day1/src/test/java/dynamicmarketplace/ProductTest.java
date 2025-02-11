package dynamicmarketplace;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void testProductCreation() {
        BookCategory bookCategory = new BookCategory("Technology");
        Product<BookCategory> book = new Product<>("Java Programming", 500, bookCategory);

        assertEquals("Java Programming", book.getName());
        assertEquals(500, book.getPrice());
        assertEquals("Technology", book.getCategory().getCategoryName());
    }

    @Test
    void testCategoryAssignment() {
        ClothingCategory clothingCategory = new ClothingCategory("Apparel");
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 1200, clothingCategory);

        assertEquals("Apparel", shirt.getCategory().getCategoryName());
    }

    @Test
    void testApplyDiscount() {
        GadgetCategory gadgetCategory = new GadgetCategory("Electronics");
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 25000, gadgetCategory);

        DiscountUtil.applyDiscount(smartphone, 10);

        assertEquals(22500, smartphone.getPrice(), 0.01);
    }

    @Test
    void testZeroDiscount() {
        BookCategory bookCategory = new BookCategory("Technology");
        Product<BookCategory> book = new Product<>("Java Programming", 500, bookCategory);

        DiscountUtil.applyDiscount(book, 0);

        assertEquals(500, book.getPrice());
    }

    @Test
    void testFullDiscount() {
        ClothingCategory clothingCategory = new ClothingCategory("Apparel");
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 1200, clothingCategory);

        DiscountUtil.applyDiscount(shirt, 100);

        assertEquals(0, shirt.getPrice());
    }
}
