package Loredana.week3;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class PrimeNumber
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;

        for (int i = 2; i < n; i++)
        {
             if (n%i == 0)
             {
                 return false;
             }
        }
            return true;
        }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(n + " is a prime number: " + isPrime(n));
    }


    /*
    1. Prime Number
  Prime Number is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11,..).
  Write a method that can check if a number is prime or not.

     */
}
