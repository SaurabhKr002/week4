package shoppingcart;

import java.util.*;

class ShoppingCart {
    private Map<String, Product> productCatalog = new HashMap<>();
    private Map<String, CartItem> cart = new LinkedHashMap<>();
    private TreeMap<Double, List<CartItem>> sortedByPrice = new TreeMap<>();

    // Adds a product to the catalog
    public void addProduct(String name, double price) {
        productCatalog.put(name, new Product(name, price));
    }

    // Adds a product to the cart with the given quantity
    public void addToCart(String name, int quantity) {
        if (productCatalog.containsKey(name)) {
            Product product = productCatalog.get(name);
            cart.put(name, new CartItem(product, cart.getOrDefault(name, new CartItem(product, 0)).getQuantity() + quantity));
        }
    }

    // Calculates total price of items in the cart
    public double calculateTotal() {
        return cart.values().stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    // Returns cart items in the order they were added
    public Map<String, CartItem> getCartOrder() {
        return new LinkedHashMap<>(cart);
    }

    // Returns items sorted by price
    public Map<Double, List<CartItem>> getItemsSortedByPrice() {
        sortedByPrice.clear();
        for (CartItem item : cart.values()) {
            sortedByPrice.putIfAbsent(item.getProduct().getPrice(), new ArrayList<>());
            sortedByPrice.get(item.getProduct().getPrice()).add(item);
        }
        return sortedByPrice;
    }
}
