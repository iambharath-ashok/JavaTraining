package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);
        hashMap.put("cherry", 7);

        // Retrieve values
        int apples = hashMap.get("apple"); // 5

        // Iterate through key-value pairs
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
