package Marsela2.week4;

public class FindUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {  // iterating through the string from 0 until the last one index
            char each = str.charAt(i);           // this gives us each character of the string

            if(str.indexOf(each)==str.lastIndexOf(each) ){ //if first time a char appeared in the string is also the last time the char appeared in the string (same index) (only once)
                unique += each;     // if it did not appear more than once , we add it to the string 'unique'

            }

        }

        System.out.println(unique);

    }
}

/*
 Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */