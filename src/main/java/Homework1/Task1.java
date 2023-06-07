package Homework1;

import java.util.Scanner;

public class Task1 {
    public void checkThirdNumber() {
        //create variables
        int numberOne;
        double numberTwo;
        int numberThree;

        //set values
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer number:");

        numberOne = sc.nextInt();
        System.out.println("Thank you, this is a valid int number: " + numberOne);

        System.out.println("Please enter a double number:");
        numberTwo = sc.nextDouble();
        System.out.println("Thank you, this is a valid double number: " + numberTwo);

        System.out.println("Please enter one more integer number:");
        numberThree = sc.nextInt();

        if ((numberThree > numberOne && numberThree < numberTwo) || (numberThree < numberOne && numberThree > numberTwo)) {
            System.out.println("Third number is  between the other numbers");
        } else {
            System.out.println("Third number is NOT between the other numbers");
        }
    }

    public static void main(String args[]) {
        Task1 firstTaskObject = new Task1();
        firstTaskObject.checkThirdNumber();

        Task2 secondTaskObject = new Task2();
        secondTaskObject.swapAndSumNumbers();

        Task3 thirdTaskObject = new Task3();
        thirdTaskObject.swapNumbers();

        Task4 fourthTaskObject = new Task4();
        fourthTaskObject.WorkLifeBalance();

        Task5 fifthTaskObject = new Task5();
        fifthTaskObject.forTask();

        Task6 sixthTaskObject = new Task6();
        sixthTaskObject.weekDay();

        Task7 seventhTaskObject = new Task7();
        seventhTaskObject.continueTask();
    }


}

