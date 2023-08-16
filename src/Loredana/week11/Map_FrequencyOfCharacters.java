package Loredana.week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_FrequencyOfCharacters
{
    /*
     Map - Frequency of Characters
  Write a method that prints the frequency of each character from a String.
  Ex: Input => "Hello World"
      Output => Map
                H -> 1
                e -> 1
                l -> 3
                o -> 2
                W -> 1
                d -> 1
     */

    public static void main(String[] args)
    {
        //takes input from user using scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine();
        
        str = str.replace(" ", "").toLowerCase();
        System.out.println("stringIntegerMap = " + str);

        Map<String, Integer> mapOfString = new LinkedHashMap<>();
        mapOfString.putAll(mapFrequencyOfCharacters(str));
        for (Map.Entry<String, Integer> each : mapOfString.entrySet())
        {
            System.out.println(each.getKey() + " -> " + each.getValue());
        }


    }
    
    public static Map<String, Integer> mapFrequencyOfCharacters(String sentence)
    {
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 0;
        char ch;
        for(int i=0; i < sentence.length(); i++)
        {
            ch = sentence.charAt(i);
            for (int j = 0; j < sentence.length(); j++)
            {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    count++;
                }
            }


            if(!map.containsKey(ch))
            {
                map.put(String.valueOf(ch), count);
            }
            count = 0;
        }
        return map;
    }
}

