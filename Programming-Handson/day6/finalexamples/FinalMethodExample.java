package javatraining.day6.finalexamples;

class Parent {
    final void finalMethod() {
        System.out.println("Final method in Parent");
    }
}

class Child extends Parent {
    // void finalMethod() { // This will result in a compilation error
    //    System.out.println("Overridden final method in Child");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.finalMethod();

        Child child = new Child();
        child.finalMethod();
    }
}
