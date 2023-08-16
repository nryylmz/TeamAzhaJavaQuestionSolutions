package Zeljko.week11;

import java.util.HashMap;
import java.util.Map;

public class MapFrequency {
    public static void main(String[] args) {
        String input = "Hello World";
        printCharacterFrequency(input);
    }

    public static void printCharacterFrequency(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        input = input.toLowerCase();


        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

