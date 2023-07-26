package Olga.week9;

import java.util.Arrays;

public class ConcatArrays {

    public static int[] concatArr(int[] arr1, int[] arr2){

        int[] concatArr = new int[arr1.length+arr2.length];

        for(int i = 0; i<arr1.length; i++){
            concatArr[i] = arr1[i];
        }

        int n = arr1.length;
        for(int j = 0; j<arr2.length; j++) {

            concatArr[n] = arr2[j];
            n++;
        }

        return concatArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        System.out.println(Arrays.toString(concatArr(arr1, arr2)));
    }
}
