package javatraining.day17.java8.defaultmethods;

public class Java7Example implements Printer, ColorPrinter{
    @Override
    public void print() {

    }

    @Override
    public void scan() {
        wifi();
    }

    @Override
    public void wifi() {
        ColorPrinter.super.wifi();
    }
}


interface Printer {
    void print();

    void scan();

    default void wifi() {

    }
}

interface ColorPrinter {
    void print();

    void scan();

    default void wifi() {

    }
}
