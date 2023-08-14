package javatraining.day3.abstraction;

// Interface
interface Vehicle {

    void start();

    void accelerate();

    void stop();
}

// Concrete class implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Concrete class implementing the interface
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class AbstractionExample2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.accelerate();
        car.stop();

        bike.start();
        bike.accelerate();
        bike.stop();
    }
}
