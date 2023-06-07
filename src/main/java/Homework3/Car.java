package Homework3;

public class Car {

    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    int freeFuel;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            double newFreeFuel = freeFuel - fuel;
            freeFuel = (int) newFreeFuel;
        }
    }
}
