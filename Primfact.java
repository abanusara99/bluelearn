package bluelearn;
import java.util.ArrayList;
import java.util.Scanner;

public class Primfact {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to get factors of a number
    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(inputNumber)) {
            System.out.println("Output: True");
        } else {
            // Get factors if not prime
            ArrayList<Integer> factors = getFactors(inputNumber);
            System.out.println("Output: " + factors);
        }

        scanner.close();
    }
}
