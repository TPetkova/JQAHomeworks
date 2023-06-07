package Homework2;

import java.util.Scanner;

public class Task3 {

    public void arrayTask() {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[5];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Please enter number %d from the array of 5 double numbers: ", i+1);
            array[i] = sc.nextDouble();

        }

        System.out.print("All 5 elements of the array are: ");
        for (double i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
