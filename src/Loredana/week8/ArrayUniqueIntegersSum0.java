package Loredana.week8;

import java.util.*;

public class ArrayUniqueIntegersSum0
{
    //function to verify if the 4th element of my array is unique
    public static boolean verifyUniqueLastElement(int n, HashSet<Integer> arrayElements)
    {
        boolean unique = true;

        for (Integer each : arrayElements)
        {
            if(n == each)
                unique = false;
        }

        return unique;
    }

    //method that generates randomly (n-2) unique elements for the array
    public static Set<Integer> arrayElementsGenerator(int n)
    {
        Random random = new Random();
        Set<Integer> arrayElements = new HashSet<>();
        do
        {
            arrayElements.add(random.nextInt(10-5+1) -5);

        }while (arrayElements.size()<(n-1));

        return arrayElements;
    }
    public static int[] uniqueIntSum (int n)
    {
        //array to store all the elements
        int [] arr = new int[n];
        //variable sum will calculate the sum of all integers from element 0 to n-2
        int sum = 0;

        //using a Hashset to store random unique numbers
        Set<Integer> elements = new HashSet<>();
        elements.addAll(arrayElementsGenerator(n));

        //calculating the sum of elements
        for (Integer each : elements)
        {
            sum += each;
        }


        //if the value of the 4th element is not unique; regenerate the elements util true;
        while (verifyUniqueLastElement(-sum, (HashSet<Integer>) elements)==false)
        {
            elements.addAll(arrayElementsGenerator(n));
        }


          int j = 0; //array index variable;
          //using a for each loop to add the unique elements from the TreeSet to my array;
          for (Integer each : elements)
          {
              arr[j++] = each;
          }

          arr[n-1] = -sum;


        return arr;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value between 1 & 100:");
        do{
            n = input.nextInt();
            if(n<1 || n>100)
                System.out.println("Invalid entry; please enter a value between 1 & 100: ");
        }while (n<1 || n>100);

        int [] arr = new int[n];
        arr = uniqueIntSum(n);
        System.out.println(Arrays.toString(arr));

    }


    /*
    1. Array - N unique integers that sum up to 0
  Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
  Example 1:
    N = 4 => the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].

    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).

  Example 2:
    N = 3 => one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */
}

