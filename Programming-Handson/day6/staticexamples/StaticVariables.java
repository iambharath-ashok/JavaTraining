package javatraining.day6.staticexamples;

class MyClass {
    static int staticVariable = 10;
    int instanceVariable;
}

public class StaticVariables {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        obj1.staticVariable = 20;  // This will change the static variable for all instances
        obj1.instanceVariable = 5;
        
        System.out.println(obj1.staticVariable);  // Output: 20
        System.out.println(obj2.staticVariable);  // Output: 20 (same as obj1)
    }
}
