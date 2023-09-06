package javatraining.day10.collections.traversal.failsafeiterators;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Boolean> concurrentHashSet = new ConcurrentHashMap<>();
        concurrentHashSet.put("Apple", true);
        concurrentHashSet.put("Banana", true);
        concurrentHashSet.put("Orange", true);

        concurrentHashSet.values();


        // Concurrent modification by another thread
        new Thread(() -> {
            concurrentHashSet.put("Grapes", true);
            concurrentHashSet.remove("Banana");
        }).start();

        // Iterating using an iterator (safe in ConcurrentHashMap)
        Iterator<String> iterator = concurrentHashSet.keySet().iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruit: " + fruit);
        }
    }
}
