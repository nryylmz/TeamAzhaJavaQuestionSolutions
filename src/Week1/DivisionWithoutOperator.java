package Week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithoutOperator
{
    /*
    2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator
     */

    public static int division(int num1, int num2)
    {
        int count = 0;
        while (num1 >= num2)
        {
            num1 -= num2;
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //
        try {
            System.out.println("Please enter the dividend (number to be divided): ");
            int num1 = input.nextInt();
            System.out.println("Please enter the divisor:");
            int num2 = input.nextInt();
            System.out.println(num1 + " / " + num2  + " = " + division(num1, num2));
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a integer number.");
            e.printStackTrace();
        }


    }
}
