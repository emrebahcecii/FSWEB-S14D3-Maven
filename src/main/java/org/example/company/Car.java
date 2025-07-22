package org.example.company;

import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        String msg = "the car's engine is starting";
        System.out.println(msg);
        return msg;
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        String msg = "the car is accelerating";
        System.out.println(msg);
        return msg;
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        String msg = "the car is braking";
        System.out.println(msg);
        return msg;
    }
}
