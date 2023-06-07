package Homework2;

public class Task5 {
    public void arrayClone() {
        int[] array = {10,12,1,8,4};
        int[] arrayToCopy = array.clone();

        System.out.println("The elements from the 1st array are:");
        for (int i: array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("The elements from the 2nd array are (copy 1st):");
        for (int i : arrayToCopy) {
            System.out.print(i + " ");
        }
    }
}
