package Loredana.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveIntegerValues
{
    public static ArrayList<Integer> removeValues(List<Integer> arr, int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int each : arr)
        {
            if(each < 100 )
                arrayList.add(each);
        }

        return arrayList;

    }

    public static void main(String[] args)
    {
        List<Integer> arrayListInteger = Arrays.asList( 1, 3, 67, 101, 23, 200, 234, 101, 145, 5, 0, 23);

       int n = 100;

        System.out.println(arrayListInteger);

        System.out.println(removeValues(arrayListInteger, n));



    }

    /*
    3) ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

}
