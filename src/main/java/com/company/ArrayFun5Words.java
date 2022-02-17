package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {

        // Initialize my tools
        Scanner scan = new Scanner(System.in);
        String[] words = new String[5];

        // Let the user know what this program does
        System.out.println("This program takes 5 words from you, places them in an array," +
                " and prints the array of words out." + "\n");

        // To see the logic behind this for-loop, please see Java Class "ArrayFunUserArray" in this project
        for (int i = 0; i < words.length; i++) {
            System.out.println("Please enter word number " + (i+1) + " of the array:");
            words[i] = scan.nextLine();
        }

        System.out.println("Your 5 words are: " + "\n" + Arrays.toString(words));
    }
}
