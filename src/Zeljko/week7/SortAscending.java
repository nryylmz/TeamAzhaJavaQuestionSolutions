package Zeljko.week7;

import java.util.Arrays;

public class SortAscending {
    public static int[] ascending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int num = 0;
                if(arr[i]<arr[j]){
                    num = arr[i];
                    arr[i]=arr[j];
                    arr[j] = num;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,7,4,2};
        System.out.println(Arrays.toString(ascending(arr)));
    }
}
