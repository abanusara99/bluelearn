package bluelearn;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // Read the string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Check if the string is a palindrome
        if (isPalindrome(input)) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        // Compare characters from start and end simultaneously
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) 
        {
            if (str.charAt(i) != str.charAt(j)) 
            {
                return false; // Characters don't match, not a palindrome
            }
        }

        return true; // All characters matched, it's a palindrome
    }
}
