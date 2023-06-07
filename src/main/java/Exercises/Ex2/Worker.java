package Exercises.Ex2;

public class Worker extends Human {
    private double pay;
    private int workHours;
    public Worker(double pay, int workHours, String name, String familyName) {
        super(name, familyName);
        this.pay = pay;
        this.workHours = workHours;
    }

    public double payForWorkingHour(double pay, int workHours) {
        double payCheck = pay / workHours;
        return payCheck;
    }

    public static void main(String[] args) {
        Worker worker = new Worker(300,6,"Pesho","Petrov");
        System.out.println(worker.payForWorkingHour(worker.pay, worker.workHours));

    }
}
