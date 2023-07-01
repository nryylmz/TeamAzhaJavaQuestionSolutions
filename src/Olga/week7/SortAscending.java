package Olga.week7;

import java.util.Arrays;

public class SortAscending {

    public static int[] sortAscending(int[] arr){

        for(int j = 0; j<arr.length-1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int num1 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num1;
                }
            }
        }
        return arr;
    }

}
