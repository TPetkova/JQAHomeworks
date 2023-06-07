package Homework2;

public class Task1 {

    public void createTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
    }

    public static void main(String args[]) {

        Task1 object1 = new Task1();
        object1.createTwoNumbers(12, 23);

        Task2 object2 = new Task2();
        object2.findAverage(8, 13);

        Task3 object3 = new Task3();
        object3.arrayTask();

        Task4 object4 = new Task4();
        object4.arrayForLoop();
        object4.arrayWhileLoop();

        Task5 object5 = new Task5();
        object5.arrayClone();

        Task6 object6 = new Task6();
        object6.compareArrays();
    }
}
