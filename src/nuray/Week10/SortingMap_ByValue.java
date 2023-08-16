package nuray.Week10;

import java.util.*;

public class SortingMap_ByValue {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Loralie ", 56);
        unsortedMap.put("Charlie", 45);
        unsortedMap.put("David", 32);
        unsortedMap.put("Phoebe", 64);

        System.out.println("Unsorted Map: " + unsortedMap);
        Map<String, Integer> sortedMap = sortMapByValues(unsortedMap);
        System.out.println("Map Sorted in Ascending order: " + sortedMap);
    }

    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort(new ValueComparator());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
    static class ValueComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
            return entry1.getValue().compareTo(entry2.getValue());
        }
    }
}


/*Write a method that can sort the Map by values.*/