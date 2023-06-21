package Marsela2.week3;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String frequencyOfChar = "hhhhgggggmmm";
        String result = "";

        for (int i = 0; i < frequencyOfChar.length(); i++) {

    char ch = frequencyOfChar.charAt(i); //whenever a char match another character in the string, count increases by 1
    int count = 0;

    for (int j = 0; j < frequencyOfChar.length(); j++) {
        if(frequencyOfChar.charAt(j) == ch){
            count++;
        }
    }

    if(result.contains("" + ch)){
        continue;
    }

    result += ch + "" + count;

        }
        System.out.println(result);
    }

}
/*
Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */