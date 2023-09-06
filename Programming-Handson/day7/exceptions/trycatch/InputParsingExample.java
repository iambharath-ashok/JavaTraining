package javatraining.day7.exceptions.trycatch;

public class InputParsingExample {
    public static void main(String[] args) {
        try {
            String input = "abc";
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch ( NullPointerException |NumberFormatException  e) {
            System.out.println("Input parsing exception: " + e);
        }
    }
}
