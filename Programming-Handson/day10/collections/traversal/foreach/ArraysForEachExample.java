package javatraining.day10.collections.traversal.foreach;

import java.util.Arrays;
import java.util.List;

public class ArraysForEachExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        for (String element : list) {
            System.out.println(element);
        }



    }
}
