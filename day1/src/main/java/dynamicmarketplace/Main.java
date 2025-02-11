package dynamicmarketplace;

// Main class to test the marketplace system
public class Main {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Technology"));
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 1200, new ClothingCategory("Apparel"));
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 25000, new GadgetCategory("Electronics"));

        System.out.println("Before Discount:");
        System.out.println(book.getName() + " - Price: " + book.getPrice());
        System.out.println(shirt.getName() + " - Price: " + shirt.getPrice());
        System.out.println(smartphone.getName() + " - Price: " + smartphone.getPrice());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(smartphone, 5);

        System.out.println("\nAfter Discount:");
        System.out.println(book.getName() + " - Price: " + book.getPrice());
        System.out.println(shirt.getName() + " - Price: " + shirt.getPrice());
        System.out.println(smartphone.getName() + " - Price: " + smartphone.getPrice());
    }
}
