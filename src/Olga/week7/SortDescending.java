package Olga.week7;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescending {
    
    public static int[] sortDescending(int[] arr){

       for(int j = 0; j < arr.length-1; j++) {
           for (int i = 0; i < arr.length-1; i++) {
               if (arr[i] < arr[i + 1]) {
                   int num1 = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = num1;
               }
           }
       }
        return arr;
    }

}
