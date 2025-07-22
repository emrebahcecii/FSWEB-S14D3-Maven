package org.example.company;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String msg = getClass().getSimpleName() + " the car's engine is starting";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String accelerate() {
        String msg = getClass().getSimpleName() + " the car is accelerating";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String brake() {
        String msg = getClass().getSimpleName() + " the car is braking";
        System.out.println(msg);
        return msg;
    }
}
