package javatraining.day6.finalexamples;

public class FinalVariableExample {
    public static void main(String[] args) {
        final int value = 10;
        // value = 20; // This will result in a compilation error
        System.out.println("Final value: " + value);
    }
}
