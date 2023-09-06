package javatraining.day10.collections.maps.hashmap;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        // Creating and using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);

        // Creating and using TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("cherry", 7);
        treeMap.put("banana", 4);
        treeMap.put("apple", 5);
        treeMap.put("banana", 3);
        treeMap.put("banana", 10);


//        Set<String> keySet = treeMap.keySet();
//        System.out.println("Keyset::"+ keySet);
//        Collection<Integer> values = treeMap.values();
//        System.out.println("values set::"+ values);
//
//        System.out.println("Entry set::"+ treeMap.entrySet());
        treeMap.entrySet().stream().forEach(System.out::println);

        System.out.println("====================================");
        for (String key : treeMap.keySet()) {

        }
        // Iterating through a map
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
