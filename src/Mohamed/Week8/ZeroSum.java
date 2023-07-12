package Mohamed.Week8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ZeroSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (between 0 and 100): ");
        int N = scanner.nextInt();
        // Validate the user input
        if (N < 0 || N > 100) {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
            scanner.close();
            return; // Exit the program
        }
        int[] myArray = new int[N];
        Random random = new Random();
        // Generate random numbers and assign them to array elements
        for (int i = 0; i < N; i++) {
            myArray[i] = random.nextInt(101); // Generates a random number between 0 and 100
        }
        // Display the array as a whole list
        System.out.println("Array: " + Arrays.toString(myArray));
        scanner.close();

    }..... //To be continued to calculate the sum
}
