package Loredana.week5;

import java.util.Scanner;

public class UniqueCharacter
{
    public static String findUniqueCharacters(String str)
    {
        int count; //variable to count the frequency of each character;
        String uniqueStr = ""; //empty string to store unique characters;

        //nested foreach loop to verify the frequency of each character;
        for(char each: str.toCharArray())
        {
            count = 0;
            for(char each1: str.toCharArray())
            {
                if(each==each1)
                {
                    count+=1;

                }
            }
            //if the character is unique then we store it in the uniqueStr variable.
            if(count == 1)
            {
                uniqueStr+=each;
            }
        }
        return uniqueStr;

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = input.next();
        System.out.println(findUniqueCharacters(str));
    }
     /*
    1. Find the unique:
  Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

}
