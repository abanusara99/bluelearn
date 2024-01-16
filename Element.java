package bluelearn;

import java.util.Arrays;

public class Element {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int steps = 3;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Rotate the array to the left
        rotateLeft(array, steps);
        System.out.println("Array after rotating left by " + steps + " steps: " + Arrays.toString(array));

        // Rotate the array to the right
        rotateRight(array, steps);
        System.out.println("Array after rotating right by " + steps + " steps: " + Arrays.toString(array));
    }

    // Function to rotate the array to the left by a given number of steps
    private static void rotateLeft(int[] arr, int steps) {
        int n = arr.length;
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Function to rotate the array to the right by a given number of steps
    private static void rotateRight(int[] arr, int steps) {
        int n = arr.length;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, n - 1);
    }

    // Function to reverse a subarray in-place
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
