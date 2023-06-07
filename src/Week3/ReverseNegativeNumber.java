package Week3;

public class ReverseNegativeNumber {


    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number; // Return number if not negative
        }

        int reversedNumber = 0;
        int positiveNumber = -number; // Convert to positive to reverse the digits

        while (positiveNumber > 0) {
            int digit = positiveNumber % 10; // Get the right digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            positiveNumber /= 10; // Remove the rightmost digit from the positive number
        }

        return -reversedNumber; // Return the reversed number as negative
    }

    public static void main(String[] args) {
        int number = -215; // Example negative number to reverse

        int reversedNumber = reverseNegativeNumber(number);
        System.out.println("Output: " + reversedNumber);
    }
}







    /* Reverse negative number
    Write a return method that can reverse negative number and return it as int.
    For example, N = -215:
    OutPut: -512

     */
