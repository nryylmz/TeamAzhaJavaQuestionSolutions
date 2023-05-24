package Week1;

import java.util.Scanner;
        /*
        import java.util.Scanner is used to import the Scanner class ,
         so that we can use it to read user input from the keyboard.
         By creating a Scanner object and calling its methods, such as nextInt(),
          we can read integers entered by the user.
         */
public class DivisionWithoutOperator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero.");
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        //Math.abs() method to calculate the absolute value of the divisor.
        // It ensures that the divisor is always positive, regardless of its original sign.

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }//test

        if (isNegative) {
            quotient = -quotient;
        }

        return quotient;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int result = divide(dividend, divisor);
        System.out.println("Result: " + result);
    }
}
