package javatraining.day17.java8.methodreferences.instancemethodreference;

import java.util.function.Consumer;

public class InstanceMethodReference {

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.print("something");

        Student s = new Student();
        s.printStudent(myObj);


// Lambda expression to call print() on myObj
        Consumer<String> lambda = str -> myObj.print(str);

// Method reference to call print() on myObj
        Consumer<String> methodReference = myObj::print;
        s.printStudentWithMethodReference(methodReference);



        lambda.accept("Hello, Lambda!"); // Using lambda expression
        methodReference.accept("Hello, Method Reference!");
    }
}

class Student {

    public void printStudent(MyClass myClassObject) {
        System.out.println("Student");
        myClassObject.print("something");
    }

    public void printStudentWithMethodReference(Consumer<String> methodReference) {
        System.out.println("Student");
        methodReference.accept("Hello, Method Reference!");
    }

}


class MyClass {
    public void print(String str) {
        System.out.println(str);
    }
}