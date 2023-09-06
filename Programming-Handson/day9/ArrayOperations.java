package javatraining.day9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = { 10, 5, 7, 20, 15, 3 };

        IntStream stream = Arrays.stream(array);
        stream.filter(v -> v ==2).forEach(System.out::println);

        System.out.println(array[10]);

        // Finding the sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Finding the average of array elements
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);

        // Finding the maximum value in the array
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max: " + max);

        // Finding the minimum value in the array
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min: " + min);
    }
}
