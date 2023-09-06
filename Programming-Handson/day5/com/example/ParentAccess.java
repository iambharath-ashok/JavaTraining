package javatraining.day5.com.example;

public class ParentAccess {
    private int privateField = 10;
    int defaultField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}
