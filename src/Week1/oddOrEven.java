package Week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class oddOrEven
{
    public static String identify(int num)
    {
       //verifies if a number is even or odd and returns the result as a string; for re-usability purposes
        String result = "";
        if(num%2 == 0)
        {
            result = "Even";
        }
        else
            result = "Odd";
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //reads from scanner a number, calls the function identify() to verify if it's odd or even and handles the exception if an incorrect input is entered
        try {
            System.out.println("Please enter a number: ");
            int number = input.nextInt();
            System.out.println(identify(number));
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer number\n");
            e.printStackTrace();
        }

    }
    /*
    1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"
     */

}
