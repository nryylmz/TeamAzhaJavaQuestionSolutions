package Loredana.week6;

import java.util.Scanner;

public class Maximum_Array
{
    public static int maximumArrayElement(int[] arr)
    {
        // int max will store the max variable;
        int max = arr[0];
        //for loop that iterates through each element of the array to find the maximum number
        for (int i = 0; i < arr.length; i++)
        {
            //if the current element is higher than the max number, we assign the higher value to the max variable
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array length:");
        int length = input.nextInt(); //length of array
        int []arr = new int[length]; //declaring an array to store the elements
        //for loop to iterate through each element of the array and read a value from the scanner;
        for (int i = 0; i < length; i++)
        {
            System.out.println("Please enter the element # " +(i+1)+ ":");
            arr[i] = input.nextInt();

        }

        System.out.println("The max value is " + maximumArrayElement(arr));

    }
    /*
    2. Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */
}
