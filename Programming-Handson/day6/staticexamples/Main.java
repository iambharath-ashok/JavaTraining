package javatraining.day6.staticexamples;

class StaticExample {
    static int staticVariable;

    static {
        staticVariable = 50;
        System.out.println("Static block executed.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(StaticExample.staticVariable);  // Output: 50
    }
}
