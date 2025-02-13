package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class ShoppingCartTest {
    @Test
    void testAddingProductsAndTotalCalculation() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 80000);
        cart.addProduct("Phone", 50000);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);

        assertEquals(180000, cart.calculateTotal(), "Total price calculation is incorrect.");
    }

    @Test
    void testCartOrder() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 80000);
        cart.addProduct("Phone", 50000);
        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 1);

        Map<String, CartItem> cartOrder = cart.getCartOrder();
        List<String> keys = new ArrayList<>(cartOrder.keySet());

        assertEquals(Arrays.asList("Laptop", "Phone"), keys, "Cart order does not match expected sequence.");
    }

    @Test
    void testItemsSortedByPrice() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Phone", 50000);
        cart.addProduct("Laptop", 80000);
        cart.addProduct("Headphones", 3000);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 1);
        cart.addToCart("Headphones", 1);

        Map<Double, List<CartItem>> sorted = cart.getItemsSortedByPrice();
        List<Double> prices = new ArrayList<>(sorted.keySet());

        assertEquals(Arrays.asList(3000.0, 50000.0, 80000.0), prices, "Sorted price order is incorrect.");
    }
}
