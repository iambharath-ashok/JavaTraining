package javatraining.day17.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, String> function = num -> "Number: " + num;

        List<String> transformedNumbers = numbers.stream()
                .map(function)
                .collect(Collectors.toList());

        System.out.println("Transformed numbers: " + transformedNumbers);
    }
}
