package Zeljko.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinimum {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("a", 11);
        inputMap.put("e", 6);
        inputMap.put("l", 3);
        inputMap.put("o", 2);
        inputMap.put("W", 1);
        inputMap.put("d", 1);
        inputMap.put("g", 8);

        int minValue = getMinValue(inputMap);
        System.out.println("Minimum value: " + minValue);
    }

    public static int getMinValue(Map<String, Integer> map) {

        int minValue = Integer.MAX_VALUE;


        for (int value : map.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }
}

