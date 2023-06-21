package Loredana.week5;

import java.util.Scanner;

public class ReverseString
{
    //method that will reverse a string
    public static String reverse(String str)
    {
        String reverseStr = ""; //variable to store the reverse string;
        for(int i = str.length()-1; i>=0; i--)
        {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = input.next();
        System.out.println(reverse(str));

    }

    /*
    2. Reverse:
  Write a return method that can reverse String.
  Ex: Reverse("ABCD"); ==> DCBA
     */
}
