package Homework3;

import java.text.DecimalFormat;

public class CarPerson {
    public static void main(String args[]) {
        Car ford = new Car();
        Car bmw = new Car();

        ford.year = 2016;
        ford.price = 10000.100;
        ford.isSportCar = false;
        ford.fuelTankCapacity = 80;
        ford.freeFuel = 30;
        ford.engineFuelOperationSystem = "gasoline";

        bmw.year = 2020;
        bmw.price = 20000.200;
        bmw.isSportCar = true;
        bmw.fuelTankCapacity = 90;
        bmw.freeFuel = 60;
        bmw.engineFuelOperationSystem = "gasoline";

        bmw.useFuel(25);

        ford.changeEngineFuelOperationSystem("diesel");

        System.out.println("First car is ford and its characteristics are:" + "\nYear: " + ford.year +
                "\nPrice: "  + new DecimalFormat("#####.000").format(ford.price) + "\nSport car: " +
                ford.isSportCar + "\nFuel Tank Capacity: " + ford.fuelTankCapacity + "\nFree fuel: " +
                ford.freeFuel + "\nEngine fuel operation system: " + ford.engineFuelOperationSystem);

        System.out.println("Second car is bmw and its characteristics are:" + "\nYear: " + bmw.year +
                "\nPrice: "  + new DecimalFormat("#####.000").format(bmw.price) + "\nSport car: " +
                bmw.isSportCar + "\nFuel Tank Capacity: " + bmw.fuelTankCapacity + "\nFree fuel: " +
                bmw.freeFuel + "\nEngine fuel operation system: " + bmw.engineFuelOperationSystem);

    }
}
