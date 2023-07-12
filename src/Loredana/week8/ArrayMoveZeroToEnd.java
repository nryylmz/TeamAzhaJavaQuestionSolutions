package Loredana.week8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMoveZeroToEnd
{
    /*
    2. Array - Move Zeros to the End
  Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
  Example:
    input; [1, 0, 2, 0, 3, 0, 4, 0]
    output:[1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] arrayZero(int [] arr)
    {
        int[] arrZero = new int[arr.length];
        int j = 0; //index to keep track of the elements in my new array;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]!=0)
                arrZero[j++]=arr[i];
        }

        if(j!= arr.length-1)
            for(int i = j+1; j<arr.length; j++)
            {
                arrZero[i] = 0;
            }

        return arrZero;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Please enter the element #" + (i+1));
            arr[i] = input.nextInt();

        }
        System.out.println("The array entered is: \n" + Arrays.toString(arr));

        System.out.println("Move Zero to the End array is:");

        System.out.println(Arrays.toString(arrayZero(arr)));
    }
}
