package bluelearn;

import java.util.Scanner;

public class Taxra {
    // Constant for tax rate (8%)
    private static final double TAX_RATE = 0.08;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the prices of items
        System.out.println("Enter the prices of items (separated by spaces):");
        
        // Read the input as a line and split it into an array of strings
        String[] inputPrices = scanner.nextLine().split(" ");

        // Initialize variables for total cost and each item's cost
        double totalCost = 0.0;
        
        // Calculate the total cost
        for (String inputPrice : inputPrices) {
            // Convert each input price to a double and add it to the total cost
            totalCost += Double.parseDouble(inputPrice);
        }

        // Calculate the total cost including tax
        double totalCostWithTax = totalCost * (1.0 + TAX_RATE);

        // Display the total cost including tax
        System.out.printf("Total Cost (including %.0f%% tax): %.2f%n", TAX_RATE * 100, totalCostWithTax);

        // Close the Scanner
        scanner.close();
    }
}
