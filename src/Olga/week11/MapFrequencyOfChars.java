package Olga.week11;

import Mohamed.Week4.frequencyOfChars;

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyOfChars {

    public static Map<String, Integer>frequencyOfChars(String str){

        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < str.length(); i++) {

            map.put(str.charAt(i)+"", map.getOrDefault(str.charAt(i)+"", 0)+1);

        }
return map;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("Hello World!"));
    }

}
