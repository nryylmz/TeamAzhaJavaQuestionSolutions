package Loredana.week6;

import java.util.Scanner;

public class SumOfDigits
{
    public static int sumOfDigits(String str)
    {
        int sum = 0;
        //for loop that iterates through each element of the array to find the maximum number
        for (int i = 0; i < str.length(); i++)
        {
           if(Character.isDigit(str.charAt(i)))
           {
               //sum+= Integer.parseInt((str.charAt(i)+""));
               sum+= Integer.parseInt(String.valueOf(str.charAt(i)));
           }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = input.nextLine(); //length of array
        System.out.println("The sum of all the digits is: " + sumOfDigits(str));

    }
    /*
    3. Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */
}
