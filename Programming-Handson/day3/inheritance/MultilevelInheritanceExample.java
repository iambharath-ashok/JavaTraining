package javatraining.day3.inheritance;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving a car");
    }
}

class ElectricCar extends Car {
    @Override
    void drive() {
        System.out.println("Driving an electric car");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle electricCar = new ElectricCar();

        vehicle.drive();     // Output: Driving a vehicle
        car.drive();         // Output: Driving a car
        electricCar.drive(); // Output: Driving an electric car
    }
}
