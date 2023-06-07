package Homework1;

import java.util.Scanner;

public class Task6 {
    public void weekDay() {
        int number;

        System.out.println("Please enter the number between 1 and 7: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number < 1 || number > 7) {
            do {
                System.out.println("Please enter the valid number");
                number = sc.nextInt();
            }
            while (number < 1 || number > 7);


        }

        switch (number) {
            case 1:
                System.out.println("1st day of week is Monday");
                break;
            case 2:
                System.out.println("2nd day of week is Tuesday");
                break;
            case 3:
                System.out.println("3rd day of week is Wednesday");
                break;
            case 4:
                System.out.println("4th day of week is Thursday");
                break;
            case 5:
                System.out.println("5th day of week is Friday");
                break;
            case 6:
                System.out.println("6th day of week is Saturday");
                break;
            case 7:
                System.out.println("7th day of week is Sunday");
                break;
        }
    }
}
