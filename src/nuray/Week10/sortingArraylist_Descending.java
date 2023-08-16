package nuray.Week10;

import java.util.ArrayList;
import java.util.Arrays;

public class sortingArraylist_Descending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(35, 65, 44, 66, 68, 127));
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int num1 = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, num1);

                }

            }
        }
        System.out.println(list);
    }
}
/*Write a method that can sort the ArrayList in descending order without
using the sort method.*/