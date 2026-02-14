package basics;

import java.util.Scanner;
/*
 * This program asks the user to enter a password and checks if it is valid.
 * A valid password must be at least 6 characters long and contain at least one number.
 * The program prints a message indicating whether the password is valid or not
 * and explains which rule was not satisfied.
 */

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter password:");

        String password = input.nextLine();

        checkValidity(password);
    }

    public static void checkValidity(String s) {

        boolean hasValidLength = checkLength(s);
        boolean hasNumber = checkNumber(s);

        if (hasValidLength && hasNumber) {
            System.out.println("Valid password");

        } else if (!hasValidLength && hasNumber) {
            System.out.println("Invalid password. It must be longer.");

        } else if (hasValidLength && !hasNumber) {
            System.out.println("Invalid password. It must contain a number.");

        } else {
            System.out.println("Invalid password. It does not meet any requirement.");
        }
    }

    public static boolean checkLength(String s) {
        return s.length() >= 6;
    }

    public static boolean checkNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}