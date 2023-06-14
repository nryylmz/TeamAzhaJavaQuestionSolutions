package Loredana.week4;

import java.util.Scanner;

public class RemoveDuplicates
{
    public static String removeDup(String str)
    {
        String strUnique = "";
        //check with a for loop if the character exists more than once and store it into a new string just once.
        for (int i = 0; i < str.length() ; i++)
        {
            int count = 0;
            if(!strUnique.contains(str.charAt(i)+"") && count ==0)
            {
                strUnique+= str.charAt(i);
                count++;
            }

        }
        return strUnique;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.next();

        System.out.println(removeDup(str));

    }
    /*
    3. Remove Duplicates
Write a return method that can remove the duplicated values from String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
}
