package Loredana.week9;

import java.util.Arrays;

public class Concat2Arrays
{

    public static int[] concat(int[]arr1, int [] arr2)
    {
        int n = arr1.length; //variable to store the length of the first array
        int m = arr2.length; //variable to store the length of the second array
        int [] arr = new int[m+n];

        int i = 0; //array index
        for (int each : arr1)
        {
            arr[i++] = each;
        }

        for (int each : arr2)
        {
            arr[i++] = each;
        }

        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6};

        System.out.println("First array: " + Arrays.toString(arr1));
        int[] arr2 = {7,8,9};
        System.out.println("Second array: " + Arrays.toString(arr2));

        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }

/*
1) Array - Concat two arrays
  Write a return method that can concate two arrays.
 */

}
