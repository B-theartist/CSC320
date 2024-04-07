/*
START

    // Declare variables
    DECLARE weeklyIncome AS DOUBLE
    DECLARE taxRate AS DOUBLE
    DECLARE averageWithholding AS DOUBLE

    // Input the weekly income
    PRINT "Enter your weekly income: "
    INPUT weeklyIncome

    // Determine the tax rate based on income
    IF weeklyIncome < 500 THEN
        taxRate = 0.10
    ELSE IF weeklyIncome >= 500 AND weeklyIncome < 1500 THEN
        taxRate = 0.15
    ELSE IF weeklyIncome >= 1500 AND weeklyIncome < 2500 THEN
        taxRate = 0.20
    ELSE
        taxRate = 0.30
    END IF

    // Calculate the average withholding
    averageWithholding = weeklyIncome * taxRate

    // Output the result
    PRINT "The weekly average tax withholding is: " + averageWithholding

END
*/

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weekly income
        System.out.print("Enter your weekly income: ");
        double weeklyIncome = scanner.nextDouble();

        // Determine tax rate
        double taxRate;
        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculate average withholding
        double averageWithholding = weeklyIncome * taxRate;

        // Output the result
        System.out.printf("The weekly average tax withholding is: $%.2f\n", averageWithholding);
    }
}

