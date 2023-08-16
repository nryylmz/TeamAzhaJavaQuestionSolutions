package Olga.week11;

import java.util.*;

public class MapMinValue {

    public static Integer mapMinValue(Map<String, Integer> map){

        List<Integer> list = new ArrayList<>();

        for (Integer each : map.values()){
            list.add(each);
        }

        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                Collections.swap(list, i, i+1);
            }
        }
        return list.get(0);

    }

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        // Add key-value pairs to the map
        myMap.put("a", 3);
        myMap.put("b", 1);
        myMap.put("c", 5);
        System.out.println("mapMinValue(myMap) = " + mapMinValue(myMap));
    }

}
