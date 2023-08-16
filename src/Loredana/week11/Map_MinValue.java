package Loredana.week11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_MinValue
{
    /*
    Map - Min value
  Write a method that can return the minimum value from a map (DO NOT
use sort method).
  Ex: Input  => Map
               Key -> Value
                a  -> 11
                e  -> 6
                l  -> 3
                o  -> 2
                W  -> 1
                d  -> 1
                g  -> 8

      Output => 1
     */

    public static void main(String[] args)
    {

        Map<Character, Integer> mapOfString = new LinkedHashMap<>();
        mapOfString.put('a', 11);
        mapOfString.put('e', 6);
        mapOfString.put('l', 3);
        mapOfString.put('o', 2);
        mapOfString.put('W', 1);
        mapOfString.put('d', 1);
        mapOfString.put('g', 8);

        System.out.println("minValueMap(mapOfString) = " + minValueMap(mapOfString));


    }

    public static int minValueMap(Map<Character, Integer> map)
    {
        int min = map.get('a');

        for (Integer each : map.values())
        {
            if (min > each)
            {
                min = each;
            }
        }
        return min;
    }

}
