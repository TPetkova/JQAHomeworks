package Homework2;

import java.util.Scanner;

public class Task4 {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];

    public void arrayForLoop() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Please enter number %d from the array of 10 integers: ", i + 1);
            array[i] = sc.nextInt();
        }

        System.out.print("All 10 elements of the array are: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public void arrayWhileLoop() {
        int i = 0;
        while (i < array.length) {
            System.out.printf("Please enter number %d from the array of 10 integers: ", i + 1);
            array[i] = sc.nextInt();
            i++;
        }

        System.out.print("All 10 elements of the array are: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }

        System.out.println();
    }
}
