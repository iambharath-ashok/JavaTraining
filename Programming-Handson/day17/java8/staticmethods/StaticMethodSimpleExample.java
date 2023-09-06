package javatraining.day17.java8.staticmethods;

interface Utility {
    static void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class StaticMethodSimpleExample {
    public static void main(String[] args) {
        Utility.printMessage("Hello, Static Method!"); // Prints "Message: Hello, Static Method!"
    }
}
