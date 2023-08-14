package javatraining.day4.constructors;

class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
    }
}

public class ConstructorsExample1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
