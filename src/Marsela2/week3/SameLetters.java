package Marsela2.week3;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {
    public static boolean haveSameLetters(String str1, String str2) {

        str1 = str1.replaceAll(" ", "").toLowerCase(); //remove spaces and convert to lowercase
        str2 = str2.replaceAll(" ", "").toLowerCase();

        //sort the strings --> The toCharArray method converts each string into a character array.
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);  //sort method sorts them in ascending order
        Arrays.sort(arr2);

        // Compare the sorted strings
        return Arrays.equals(arr1, arr2);  //Arrays.equals method is used to compare the sorted character arrays. If they are equal, the two strings have the same letters.

    } // added new code


    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 ="heart";

        boolean result = SameLetters.haveSameLetters(str1, str2);{   //method returns true, if they have same letters, and false if not
            System.out.println(result);
        }
    }


}

/*
Write a return method that check if a string is build out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */