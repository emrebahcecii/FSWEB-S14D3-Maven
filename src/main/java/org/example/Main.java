package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {


        CarSkeleton[] cars = new CarSkeleton[]{
                new GasPoweredCar("Mustang", "Classic muscle car", 8.5, 6),
                new ElectricCar("Tesla Model 3", "Smart electric sedan", 450.0, 75),
                new HybridCar("Toyota Prius", "Eco-friendly hybrid", 25.0, 40, 4)
        };

        for (CarSkeleton car : cars) {
            System.out.println("----- " + car.getName() + " -----");
            car.startEngine();
            car.drive();
            System.out.println("Description: " + car.getDescription());
            printCarType(car);
            System.out.println();
        }
    }

    public static void printCarType(CarSkeleton car) {
        System.out.println("Car Type: " + car.getClass().getSimpleName());
    }

}