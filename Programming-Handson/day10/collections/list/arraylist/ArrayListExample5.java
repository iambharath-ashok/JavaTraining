package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        List<Integer> subList = numbers.subList(2, 6); // Sublist from index 2 to 5
        System.out.println("Sublist: " + subList);
    }
}
