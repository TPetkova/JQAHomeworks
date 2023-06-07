package Homework1;

import java.util.Scanner;

public class Task4 {
    public void WorkLifeBalance() {
        int workHours;
        double money;
        boolean dayOff;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integer number for workHours, double number for money, true or false if it is a work day or not: ");

        workHours = sc.nextInt();
        money = sc.nextDouble();
        dayOff = sc.nextBoolean();

        if (dayOff == false) {
            System.out.println("I will go to work because it is not a day off");
        }

        if (money > 0 && dayOff == true) {
            System.out.println("I will go to a movie");

        } else if (money <= 0) {
            System.out.println("I will stay home and watch tv");
        }

        if (money < 10 && money > 0 && dayOff == true) {
            System.out.println("I will go for an ice cream");

        }
    }
}
