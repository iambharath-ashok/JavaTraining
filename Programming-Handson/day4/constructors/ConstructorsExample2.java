package javatraining.day4.constructors;

class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class    ConstructorsExample2 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Emily", 22);

        System.out.println("Student 1 - Name: " + student1.name + ", Age: " + student1.age);
        System.out.println("Student 2 - Name: " + student2.name + ", Age: " + student2.age);
    }
}
