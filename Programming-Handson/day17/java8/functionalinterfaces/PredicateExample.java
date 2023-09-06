package javatraining.day17.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        Predicate<String> predicate = str -> str.length() > 5;

        //Initialization of Stream
        Stream<String> stringStream = names.stream();

        //Intermediate Operations
        Stream<String> predicate1 = stringStream.filter(name -> name.length() > 5);

        //Terminal Operators
        predicate1.collect(Collectors.toList());

        List<String> longNames = names.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println("Long names: " + longNames);
    }
}
