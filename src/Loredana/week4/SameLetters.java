package Loredana.week4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class SameLetters
{
    //method that sorts a given string
    public static String sort(String str)
    {
        //converting the string into an ArrayList
        List<Character> str1List = new ArrayList<>();
        for(char each: str.toCharArray())
        {
            str1List.add(each);
        }

        //sorting the list
        Collections.sort(str1List);

        //return sorted string;
        return str1List.toString();

    }
    public static boolean same(String str1, String str2)
    {
       //verify if the strings have same length
        if(str1.length() != str2.length())
            return false;
        else
        {
            //sort the strings
            str1 = sort(str1);
            str2 = sort(str2);
            //compare the strings;
            if(str1.equalsIgnoreCase(str2))
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first string to be compared: ");
        String str1 = input.next();
        System.out.println("Please enter the second string to be compared: ");
        String str2 = input.next();
        System.out.println(str1 + " has same letters as " + str2+ ": " + same(str1, str2));

    }
    /*
    2. Same letters
Write a return method that check if a string is build out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */
}
