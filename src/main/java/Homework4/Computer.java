package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer compare) {
        if (price > compare.price) {
            return -1;
        } else if (price < compare.price) {
            return 1;
        } else {
            return 0;
        }

    }


}
