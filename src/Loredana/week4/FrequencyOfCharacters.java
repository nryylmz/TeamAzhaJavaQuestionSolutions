package Loredana.week4;

import java.util.Scanner;

public class FrequencyOfCharacters
{
    public static void main(String[] args)
    {
        //takes input from user using scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String wordEntered = input.next();
        //prints out the frequency of characters
        System.out.println(frequencyOfCharacters(wordEntered));
    }

    public static String frequencyOfCharacters(String wordEntered)
    {
        String newStr = ""; //variable to store the new string
        int count = 0; //variable to store the frequency of each character

        //will use 2 for loops to check the frequency for each character
        for(int i=0; i < wordEntered.length(); i++)
        {
            char ch = wordEntered.charAt(i);
            for(int j=0; j< wordEntered.length(); j++)
            {
                if(wordEntered.charAt(i)== wordEntered.charAt(j))
                {
                    count++;
                }
            }
            //checks if the character has already been added to the new string; if the character is not found it adds it.
            if(!newStr.contains("" +ch))
            {
                newStr += "" + wordEntered.charAt(i) + count;
            }
            count = 0;

        }
        return newStr;

    }

    /*
    1. Frequency of Characters
    Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
}
