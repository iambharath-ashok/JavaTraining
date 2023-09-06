package javatraining.day17.java8.defaultmethods;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    // No implementation for show()

}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class D implements B, C {
    // Needs to provide its own implementation for show()
    @Override
    public void show() {
       // B.super.show(); // Explicitly call B's default method
        C.super.show(); // Explicitly call C's default method
        System.out.println("D");
    }
}

public class DefaultMethodComplexExample {
    public static void main(String[] args) {
        D d = new D();
        d.show(); // Prints "A", "C", "D"
    }
}
