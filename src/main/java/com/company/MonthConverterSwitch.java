package com.company;
import java.util.Scanner;

public class MonthConverterSwitch {
    public static void main(String[] args) {
        // Initialize my tools
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 12 inclusive: ");
        // Note: The switch method does not require a conversion from a string into an integer. We can also intake the
        // written numbers ("One", "one", etc.). If there is a typo in the input (weirdly capitalized letters), then
        // I will return an error because there would be too many combinations.

        String userNum = scan.nextLine();

        switch (userNum) {
            case "1":
            case "One":
            case "one":
            case "ONE":
                System.out.println("January");
                break;
            case "2":
            case "Two":
            case "two":
            case "TWO":
                System.out.println("February");
                break;
            case "3":
            case "Three":
            case "three":
            case "THREE":
                System.out.println("March");
                break;
            case "4":
            case "Four":
            case "four":
            case "FOUR":
                System.out.println("April");
                break;
            case "5":
            case "Five":
            case "five":
            case "FIVE":
                System.out.println("May");
                break;
            case "6":
            case "Six":
            case "six":
            case "SIX":
                System.out.println("June");
                break;
            case "7":
            case "Seven":
            case "seven":
            case "SEVEN":
                System.out.println("July");
                break;
            case "8":
            case "Eight":
            case "eight":
            case "EIGHT":
                System.out.println("August");
                break;
            case "9":
            case "Nine":
            case "nine":
            case "NINE":
                System.out.println("September");
                break;
            case "10":
            case "Ten":
            case "ten":
            case "TEN":
                System.out.println("October");
                break;
            case "11":
            case "Eleven":
            case "eleven":
            case "ELEVEN":
                System.out.println("November");
                break;
            case "12":
            case "Twelve":
            case "twelve":
            case "TWELVE":
                System.out.println("December");
                break;
            default:
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
        // Side assignment for myself:
        // How would you write the code so that it is not case-sensitive? How would I incorporate the loops into this?
        // How might I let the user keep converting months until they decide to exit the program themselves?
    }
}
