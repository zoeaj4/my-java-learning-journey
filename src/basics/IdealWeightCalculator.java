package basics;

import java.util.Scanner;

/*
 * This program calculates an estimated ideal weight based on the user's gender
 * and height in centimeters.
 * If the user is male, the formula is: height - 110.
 * If the user is female, the formula is: height - 120.
 * This is a simple academic exercise to practice conditional statements and user input.
 */

public class IdealWeightCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your gender (Male or Female):");
        String gender = input.nextLine();

        System.out.println("Enter your height in centimeters:");
        int height = input.nextInt();

        int idealWeight;

        if (gender.equalsIgnoreCase("Male")) {
            idealWeight = height - 110;
            System.out.println("Your ideal weight is " + idealWeight + " kg.");

        } else if (gender.equalsIgnoreCase("Female")) {
            idealWeight = height - 120;
            System.out.println("Your ideal weight is " + idealWeight + " kg.");

        } else {
            System.out.println("Invalid gender input.");
        }

        input.close();
    }
}
