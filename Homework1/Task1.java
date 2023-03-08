package Homework1;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[])
    {
        //initialize the variables
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

        if ((numberThree>numberOne && numberThree<numberTwo) || (numberThree<numberOne && numberThree>numberTwo)) {
            System.out.println("Third number is  between the other numbers");
        }
        else{
            System.out.println("Third number is NOT between the other numbers");
        }

        Task2 secondTaskObject = new Task2();
        secondTaskObject.task2();

        Task3 thirdTaskObject = new Task3();
        thirdTaskObject.task3();

        Task4 fourthTaskObject = new Task4();
        fourthTaskObject.task4();

        Task5 fifthTaskObject = new Task5();
        fifthTaskObject.task5();

        Task6 sixthTaskObject = new Task6();
        sixthTaskObject.task6();

        Task7 seventhTaskObject = new Task7();
        seventhTaskObject.task7();
        }


    }

