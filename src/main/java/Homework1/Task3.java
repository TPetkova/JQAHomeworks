package Homework1;

import java.util.Scanner;

public class Task3 {
    public void swapNumbers() {
        int numberOne, numberTwo, numberThree, swapNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 3 integer numbers");
        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();
        numberThree = sc.nextInt();

        swapNumber = numberOne;
        numberOne = numberTwo;
        numberTwo = numberThree;
        numberThree = swapNumber;

        System.out.println("The swapped numbers are: " + numberOne + " " + numberTwo + " " + numberThree);

        int sum = numberOne + numberTwo;
        System.out.println("The sum of the first 2 numbers is: " + sum);
        int subtraction = sum - numberThree;
        System.out.println("The subtraction of the sum and third numbers is: " + subtraction);

    }
}
