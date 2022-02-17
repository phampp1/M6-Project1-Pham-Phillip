package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        // Initialize my tools to be used
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[5];

        System.out.println("Hello! This program creates an array of 5 numbers." + "\n");

        // Prompt user to enter in numbers and store each input into the array
        for (int i = 0; i < arr1.length; i++) {

            // Prompts user and stores user input for each iteration
            // Have to use "i+1" so that it corrects for the array starting with position 0
            // Make sure the user only inputs an integer, since we cannot read any other data type using this method
            System.out.println("Please enter number " + (i+1) + " of the array (Note: INTEGERS ONLY):");
            arr1[i] = Integer.parseInt(scan.nextLine());
        }

        // Print out array elements. Please note that I found the java.util.Arrays utility online.
        System.out.println("Your array is: " + "\n" + Arrays.toString(arr1));
    }
}
