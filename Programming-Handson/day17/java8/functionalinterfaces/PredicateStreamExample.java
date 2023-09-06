package javatraining.day17.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Predicate<String> namePredicate = name -> name.length() > 4;

        List<String> longNames = names.stream()
                .filter(namePredicate)
                .collect(Collectors.toList());

        System.out.println("Long names: " + longNames);
    }
}
