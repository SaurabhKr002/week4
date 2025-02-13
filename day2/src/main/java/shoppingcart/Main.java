package shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the catalog
        cart.addProduct("Laptop", 80000);
        cart.addProduct("Phone", 50000);
        cart.addProduct("Headphones", 3000);

        // Adding items to the cart
        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Headphones", 3);

        // Displaying cart order
        System.out.println("Cart Order: " + cart.getCartOrder());

        // Displaying total price
        System.out.println("Total Price: ₹" + cart.calculateTotal());

        // Displaying sorted items by price
        System.out.println("Sorted by Price: " + cart.getItemsSortedByPrice());
    }
}
