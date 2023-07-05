package Loredana.week7;

import java.util.Arrays;
import java.util.Scanner;

public class SortDescending
{
    /*
    Array - Sort Descending
  Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
  Ex: int[] arr = {10,20,7, 8, 90};
  arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static int [] sort (int [] arr)
    {
        int temp = 0;
        int swap = 0;
        for (int i =0; i < arr.length; i++)
        {
            for(int j = 0; j<= arr.length -2; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;

                }
            }
            if(swap == 0)
                break;

        }
        return arr;
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
        System.out.println(Arrays.toString(sort(arr)));
    }
}
