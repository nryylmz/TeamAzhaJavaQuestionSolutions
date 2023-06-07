package Ahmed.Week3;

public class ReverseNegativeNumber {


    public static int reverseNegativeNumber(int number) {
        // Step 1: Check if the number is non-negative
        if (number >= 0) {
            return number;
        }

        // Step 2: Convert the number to a positive value
        int positiveNumber = Math.abs(number);

        // Step 3: Reverse the positive number
        int reversedNumber = 0;
        while (positiveNumber > 0) {
            int digit = positiveNumber % 10;   // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit;   // Append the digit to the reversed number
            positiveNumber /= 10;   // Remove the last digit from the positive number
        }

        // Step 4: Return the reversed number with a negative sign
        return -reversedNumber;
    }

    public static void main(String[] args) {
        int N = -215; // Example negative number to reverse

        int reversedNumber = reverseNegativeNumber(N);
        System.out.println("Output: " + reversedNumber);
    }
}

