package Olga.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static String frequencyOfChars1(String chars){

        String result = "";

        ArrayList<String> list = new ArrayList<>();
        String[] arr = chars.split("");
        list.addAll(Arrays.asList(arr));

        for(String each : list){
            if(result.contains(each)){
                continue;
            }
            result += each+ Collections.frequency(list,each);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("frequencyOfChars1(\"AAABBD\") = " + frequencyOfChars1("AAABBD"));

    }

}
