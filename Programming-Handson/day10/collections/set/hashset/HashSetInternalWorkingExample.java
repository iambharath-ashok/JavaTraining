package javatraining.day10.collections.set.hashset;

import java.util.HashSet;

public class HashSetInternalWorkingExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");//8
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Pear"); //8


        hashSet.add("Apple");


        "Apple".equals("Apple");
        "Apple".equals("Pear");//new Node

        System.out.println("HashSet: " + hashSet);
    }
}
