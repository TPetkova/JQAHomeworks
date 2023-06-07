package Homework2;

import java.util.Arrays;

public class Task6 {
    public void compareArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("\nArray 1 is equal to array 2");
        } else {
            System.out.println("\nArray 1 is NOT equal to array 2");
        }
    }
}
