package javatraining.day10.collections.traversal.foreach;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Traversing ArrayList using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
