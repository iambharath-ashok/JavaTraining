package javatraining.day17.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListExample {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> flatList = nestedLists.stream()
            .flatMap(list -> list.stream())
            .collect(Collectors.toList());

        System.out.println("Flattened List: " + flatList);
    }
}
