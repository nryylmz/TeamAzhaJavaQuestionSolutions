package Loredana.week10;

import java.util.ArrayList;

public class ArrayList_SortingAscending
{
    /*
    1. ArrayList - sorting in ascending
  Write a method that can sort the ArrayList in Ascending order without using
the sort method.
     */

    public static ArrayList<Integer> sortArrayListAscending(ArrayList<Integer> arrayList)
    {
        int temp = 0;
        int swap = 0;
        for (int i = 0; i <= arrayList.size()-1; i++)
        {
            for(int j = 0; j <= arrayList.size()-2; j++)
            {
                if(arrayList.get(j) > arrayList.get(j+1))
                {
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                    swap++;

                }
            }
            if(swap == 0)
                break;

        }
        return arrayList;

    }

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(2);
        arrayList.add(13);
        arrayList.add(1);
        arrayList.add(19);
        arrayList.add(10);
        arrayList.add(4);

        System.out.println("ArrayList to be sorted: " + arrayList);
        System.out.println("Sorted Ascending ArrayList: " +sortArrayListAscending(arrayList));

    }
}
