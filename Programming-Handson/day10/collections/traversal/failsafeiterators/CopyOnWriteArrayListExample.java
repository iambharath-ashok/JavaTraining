package javatraining.day10.collections.traversal.failsafeiterators;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("One");

        list.add("Two");
        list.add("Three");

        // Concurrent modification by another thread
        new Thread(() -> {
            list.add("Four");
            list.remove("Two");
        }).start();

        // Iterating using a fail-safe iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
