package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(){

    }
    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){
        System.out.println("Car the car's engine is starting");
    }
    public void drive(){
        System.out.println("Car the car is accelerating");
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car the car is braking");
    }
}
