package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();

        cart.put("Apple", 3);
        cart.put("Banana", 2);
        cart.put("Orange", 4);

        // Adding more items to the cart
        cart.put("Apple", cart.getOrDefault("Apple", 0) + 2);

        // Displaying items and quantities
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
