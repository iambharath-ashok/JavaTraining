package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        numbers1.addAll(numbers2); // Adding all elements from numbers2 to numbers1

        System.out.println("Combined list: " + numbers1);
    }
}
