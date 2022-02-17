package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter in a number between 1 and 12 inclusive: ");

        String userNum = scan.nextLine();
        // Note: If someone inputs a letter, then it is going to create an error (non-convertible to integer)

        // Convert userNum from a string into a readable integer
        int userMonth = Integer.parseInt(userNum);

        // Note: The year starts with January
        if (userMonth == 1) {
            System.out.println("January");
        } else if (userMonth == 2) {
            System.out.println("February");
        } else if (userMonth == 3) {
            System.out.println("March");
        } else if (userMonth == 4) {
            System.out.println("April");
        } else if (userMonth == 5) {
            System.out.println("May");
        } else if (userMonth == 6) {
            System.out.println("June");
        } else if (userMonth == 7) {
            System.out.println("July");
        } else if (userMonth == 8) {
            System.out.println("August");
        } else if (userMonth == 9) {
            System.out.println("September");
        } else if (userMonth == 10) {
            System.out.println("October");
        } else if (userMonth == 11) {
            System.out.println("November");
        } else if (userMonth == 12) {
            System.out.println("December");
        } else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
        // Side assignment for myself: How might we be able to write this so that the user can keep inputting until it is an acceptable data type?
        // Another side assignment: Let the user keep converting months until they prompt an exit

    }
}
