package Loredana.week7;

import java.util.Scanner;

public class MininumElemArray
{
    /*
    1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array
     */

    public static int findMinimumArray(int [] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args)
    {

        System.out.println("Please enter the array length");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
        {
            System.out.println("Please enter your element #" + (i+1));
            arr[i] = input.nextInt();

        }
        System.out.println("The smallest element is : " + findMinimumArray(arr));
    }
}
