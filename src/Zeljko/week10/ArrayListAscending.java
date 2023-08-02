package Zeljko.week10;

import java.util.ArrayList;

public class ArrayListAscending {
    public static void sortAscending(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        sortAscending(numbers);
        System.out.println(numbers);
    }
}

