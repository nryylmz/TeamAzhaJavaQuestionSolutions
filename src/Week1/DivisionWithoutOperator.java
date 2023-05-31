package Week1;
//test
public class DivisionWithoutOperator {

    public static String divideWithoutOperator(int dividend, int divisor) {
        // Convert the numbers to positive to simplify the calculation
        int absDivisor = Math.abs(divisor);
        int absDividend = Math.abs(dividend);

        int temp = absDivisor;
        int result = 0;

        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("divisor cannot be Zero");
        } else if (dividend == 0 ){
            return "0";
        }

        // Perform the division
        while (absDividend >= temp) {

            temp += absDivisor;
            result++;

        }

        // Apply the sign to the result
        if (dividend < 0)
            result *= -1;
        if (divisor < 0)
            result *= -1;

        return dividend + " divided by " + divisor + " is: " + result + " and remainder is " + (dividend - (result * divisor));

    }
}
