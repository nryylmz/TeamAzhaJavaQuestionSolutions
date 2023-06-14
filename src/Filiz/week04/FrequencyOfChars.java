package Filiz.week04;

public class FrequencyOfChars {

    public static void main(String[] args) {


        String str = "AAABBCDD"; // frequency letters
        String result = "";  // get the index of each ch

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                   count++;
                }
        }
            if(result.contains(""+ch)){ // if the char is already included in the result
                continue; // skip  the char
            }

            result += ch + "" + count;

            }

        System.out.println(result);
        }





}


/*

👇 Your Java Questions for week4 👇

1. Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2



 */