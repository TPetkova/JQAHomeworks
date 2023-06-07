package Homework1;

import java.util.Scanner;

public class Task2 {
    public void swapAndSumNumbers() {
        double first;
        double second;
        int third;
        int fourth;
        double numberDouble;
        int numberInt;

        //set values
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two double numbers:");
        first = sc.nextDouble();
        second = sc.nextDouble();

        System.out.println("Please enter two more integer numbers: ");
        third = sc.nextInt();
        fourth = sc.nextInt();

        numberDouble = first;
        first = second;
        second = numberDouble;

        System.out.println("The swap double numbers are: " + first + " " + "and " + second);

        numberInt = third;
        third = fourth;
        fourth = numberInt;

        System.out.println("The swap int numbers are: " + third + " " + "and " + fourth);

        int castIntFirst = (int) first;
        System.out.println("Double numberDouble first is " + first + " and it is casted to int " + castIntFirst);

        int castIntSecond = (int) second;
        System.out.println("Double numberDouble second is " + second + " and it is casted to int " + castIntSecond);

        int sumInt = castIntFirst + castIntSecond + third + fourth;
        System.out.println("The sum of the integer numbers is: " + sumInt);

        double castDoubleThird = (double) third;
        System.out.println("Integer numberDouble third is " + third + " and it is casted to double " + castDoubleThird);

        double castDoubleFourth = (double) fourth;
        System.out.println("Integer numberDouble fourth is " + fourth + " and it is casted to double " + castDoubleFourth);

        double sumDouble = castDoubleThird + castDoubleFourth + first + second;
        System.out.println("The sum of the double numbers is: " + sumDouble);
    }
}
