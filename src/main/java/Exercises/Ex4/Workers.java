package Exercises.Ex4;

import Exercises.Ex3.Students;

import java.util.Arrays;

public class Workers implements Comparable<Workers>{
    private String workerName;
    private double salary;
    public Workers(String workerName, double salary) {
        this.workerName = workerName;
        this.salary = salary;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerNameName) {
        this.workerName = workerName;
    }

    public double getWorkerSalary() {
        return salary;
    }

    public void setWorkerSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Workers workers) {
        if (this.salary > workers.salary) {
            return -1;
        } else if (this.salary < workers.salary) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Workers workerArray[] = new Workers[10];
        workerArray[0] = new Workers("Petar", 4440.50);
        workerArray[1] = new Workers("Georgi", 1234.25);
        workerArray[2] = new Workers("Pencho", 5555.50);
        workerArray[3] = new Workers("Stoyan", 3525.70);
        workerArray[4] = new Workers("Ivan", 10984.90);
        workerArray[5] = new Workers("Pepi", 2315.90);
        workerArray[6] = new Workers("Emo", 6756.00);
        workerArray[7] = new Workers("Plamen", 12350.00);
        workerArray[8] = new Workers("Gosho", 2114.25);
        workerArray[9] = new Workers("Pesho", 4244.50);

        Arrays.sort(workerArray);

        for (Workers worker : workerArray) {
            System.out.println(worker.getWorkerName() + " - " + worker.getWorkerSalary());
        }


    }
}
