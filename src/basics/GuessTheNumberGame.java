package basics;

import java.util.Scanner;

/*
 * This program generates a random number between 1 and 100.
 * The user must guess the number by entering values from the keyboard.
 * After each attempt, the program gives a hint indicating whether the
 * correct number is higher or lower than the user's guess.
 * The program also counts how many attempts were needed until the user
 * guesses the correct number.
 */

public class GuessTheNumberGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);

        int attempts = 0;
        int userNumber = 0;

        do {
            attempts++;

            System.out.println("Enter a number between 1 and 100:");
            userNumber = input.nextInt();

            if (randomNumber > userNumber) {
                System.out.println("Higher");
            } else if (randomNumber < userNumber) {
                System.out.println("Lower");
            }

        } while (randomNumber != userNumber);

        System.out.println("Correct! You guessed the number in " + attempts + " attempts.");

        input.close();
    }
}
