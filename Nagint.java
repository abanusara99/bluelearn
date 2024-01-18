package bluelearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Nagint {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of low and high
        System.out.println("Enter the value of low:");
        int low = scanner.nextInt();

        System.out.println("Enter the value of high:");
        int high = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Calculate and display the count and list of odd numbers between low and high
        ArrayList<Integer> oddNumbers = getOddNumbers(low, high);
        System.out.println("The odd numbers between " + low + " and " + high + " are: " + oddNumbers);
       
    }

    // Function to get the list of odd numbers between low and high (inclusive)
    private static ArrayList<Integer> getOddNumbers(int low, int high) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Iterate through the range from low to high (inclusive)
        for (int i = low; i <= high; i++) {
            // Check if the current number is odd
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        return oddNumbers;
    }
}

