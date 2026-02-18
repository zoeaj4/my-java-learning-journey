package basics;

import java.util.Scanner;

/*
 * Enumerated types (enum) are a special structure that allows defining a fixed
 * and limited set of possible values for a variable. They are used when we want
 * to guarantee that a variable can only take one of those predefined values,
 * avoiding errors and improving code readability.
 *
 * An enum can contain methods and attributes with their respective getters and
 * setters. However, objects cannot be created from an enum using "new", since
 * its values are predefined constants of the enumerated type itself.
 */

public class ClothingSizeDemo {

    enum Size {
        MINI("S"),
        MEDIUM("M"),
        LARGE("L"),
        EXTRA_LARGE("XL");

        private String abbreviation;

        private Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size: MINI, MEDIUM, LARGE, EXTRA_LARGE");
        String userInput = input.next().toUpperCase();

        Size selectedSize = Enum.valueOf(Size.class, userInput);

        System.out.println("Size: " + selectedSize);
        System.out.println("Abbreviation: " + selectedSize.getAbbreviation());

        input.close();
    }
}
