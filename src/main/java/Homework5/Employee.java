package Homework5;

public class Employee extends Person{
    private int daySalary;

    public Employee(String name, int age, boolean isMan, int daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
        if (getAge() < 18) {
            return 0;
        } else {
            double sum = hours * (daySalary * 1.5);
            return sum;
        }
    }

    void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println(getName() + "'s day salary is: " + getDaySalary());
    }
}
