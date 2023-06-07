package Mohamed.Week3;
import java.util.Scanner;
public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number; // Return the number as it is if it is not negative
        } else {
            // Convert the negative number to a string
            String numberStr = String.valueOf(number); // Convert the negative number to a string
            // Reverse the string without the negative sign
            String reversedStr = new StringBuilder(numberStr.substring(1)).reverse().toString();
            // Add the negative sign back to the reversed string
            String resultStr = "-" + reversedStr;
            // Convert the reversed string back to an integer and return it
            return Integer.parseInt(resultStr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNegativeNumber(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}


