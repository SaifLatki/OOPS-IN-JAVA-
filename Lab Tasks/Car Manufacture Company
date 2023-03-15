package com.company;
class Car {
    // Private properties
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean isRunning;

    // Constructor methods
    Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isRunning = false;
    }

    Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.mileage = 0.0;
        this.isRunning = false;
    }

    // Setter methods
    void setMake(String make) {
        this.make = make;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // Getter methods
    String getMake() {
        return this.make;
    }

    String getModel() {
        return this.model;
    }

    int getYear() {
        return this.year;
    }

    double getMileage() {
        return this.mileage;
    }

    boolean getIsRunning() {
        return this.isRunning;
    }

    // Private method
    void turnOn() {
        this.isRunning = true;
    }

    // Public methods
    void start() {
        turnOn();
        System.out.println("The car is now running.");
    }

    void stop() {
        this.isRunning = false;
        System.out.println("The car has been turned off.");
    }

    void drive(double miles) {
        if (this.isRunning) {
            System.out.println("Driving " + miles + " miles...");
            this.mileage += miles;
        } else {
            System.out.println("Cannot drive - the car is not running.");
        }
    }

    // Static method
    static void honk() {
        System.out.println("HONK HONK!");
    }
}
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2015, 50000.0);
        // Call some public methods
        car.start();
        car.drive(10.0);
        car.stop();
        // Call a static method
        Car.honk();
   }
}
