package Loredana.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveIntegerValues
{
    public static int [] removeValues(int [] arr, int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int each : arr)
        {
            if(each < 100 )
                arrayList.add(each);
        }

        int [] removeArray = new int[arrayList.size()];

        int i = 0;
        for (Integer each : arrayList)
        {
            removeArray[i++] = each;
        }


        return removeArray;

    }

    public static void main(String[] args)
    {
       int[] arr = {1, 3, 67, 101, 23, 200, 234, 101, 145, 5, 0, 23 };

       int n = 100;

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(removeValues(arr, n)));



    }

    /*
    3) ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

}
