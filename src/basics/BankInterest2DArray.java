package basics;

/*
 * This program calculates the growth of a bank account balance using compound interest.
 * A two-dimensional array is used to store the balance for different interest rates
 * over several years.
 * The initial balance is 10,000 and the interest rate starts at 10%,
 * increasing by 1% for each row.
 * The results are printed formatted with two decimal places.
 */

public class BankInterest2DArray {

    public static void main(String[] args) {

        double accumulated;
        double interestRate = 0.10;

        double[][] balance = new double[6][5];

        for (int i = 0; i < balance.length; i++) {

            balance[i][0] = 10000;
            accumulated = 10000;

            for (int j = 1; j < balance[i].length; j++) {
                accumulated = accumulated + (accumulated * interestRate);
                balance[i][j] = accumulated;
            }

            interestRate = interestRate + 0.01;
        }

        for (double[] row : balance) {
            for (double value : row) {
                System.out.printf("%1.2f%n", value);
            }
            System.out.println();
        }
    }
}

