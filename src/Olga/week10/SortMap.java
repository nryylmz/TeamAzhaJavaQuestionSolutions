package Olga.week10;

import java.util.*;

public class SortMap {

    public static HashMap<String, Integer> sortMap(HashMap<String, Integer> map){

        ArrayList<Integer> values = (ArrayList<Integer>) map.values();
        HashMap <String, Integer> resultMap = new HashMap<>();
        Set<String> keysList =  map.keySet();
        List<String> keysList2 = new ArrayList<>(keysList);


        for(int j = 0; j<values.size()-1; j++) {

            for (int i = 0; i < values.size() - 1 - j ; i++) {
                if (values.get(i) > values.get(i + 1)) {
                    Integer temp = values.get(i);
                    values.set(i, values.get(i + 1));
                    values.set(i + 1, temp);
                }
            }
        }

        for (int i = 0; i < keysList2.size(); i++) {
            String key = keysList2.get(i);
            Integer value = values.get(i);
            resultMap.put(key, value);
        }


        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 8);

        System.out.println("sortMap(map) = " + sortMap(map));
    }
}
