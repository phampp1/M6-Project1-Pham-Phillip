package com.company;
import java.util.Arrays;

public class ArrayFunReverselt {
    public static void main(String[] args) {
        // Declare the array [1,2,3,4,5] and let the user know what the original array is
        int[] arr1 = {1,2,3,4,5};
        System.out.println("This program takes a given array of [1,2,3,4,5] and reverses the order.");

        // Create another array of equal length
        int[] arr2 = new int[arr1.length];

        // Create a for-loop that fills the array with the original array values
        // but in reverse order
        for (int i = 0; i < arr1.length; i++) {

            // Store value of the original array into a variable
            int placeHold = arr1[i];

            // Store the original front array value in the back spot of the new array
            arr2[arr1.length - i - 1] = placeHold;
            // Have to use "- 1" because the array index starts at 0 and ends at 4.
            // So the first iteration for example, (arr1.length - i - 1) equates to (5 - 0 - 1).
            // Without the -1, the program would throw an exception error because the array
            // position would be out of bounds.
        }

        System.out.println("\n" + "The original array is: " + Arrays.toString(arr1));
        System.out.println("The reversed array is: " + Arrays.toString(arr2));
    }
}
