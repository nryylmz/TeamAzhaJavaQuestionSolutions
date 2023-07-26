package Loredana.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RemoveAhmed
{
    public static String [] removeName(String [] arr, String name)
    {
        ArrayList<String> nameList = new ArrayList<>();

        Collections.addAll(nameList, arr); //storing the array elements in an array list

        nameList.removeIf(p -> p.equals(name)); //remove all name occurrences from the list

        int n = nameList.size(); //length of the new array

        int i = 0;

        String [] nameListArray = new String[n]; //new array

        for (String each : nameList)
        {
            nameListArray[i++] = each;
        }

        return nameListArray;
    }


    public static void main(String[] args)
    {
        String []arr = {"Ahmed", "John", "Eric", "Ahmed", "Thomas", "Daniel", "Ahmed"};
        String nameToBeRemoved = "Ahmed";
        System.out.println(Arrays.toString(removeName(arr, nameToBeRemoved)));


    }

    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
}
