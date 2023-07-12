package Olga.week8;

import java.util.Arrays;

public class sumUpTo0 {

    public static int[] sumUpTo0(int n){

        int[] returnArr= new int[n];

        int result = 0;

        for (int i = 0; i < n-1; i++) {
            returnArr[i] = i+1;
            result+=returnArr[i];
        }
        returnArr[n-1] = -result;

        return returnArr;
    }

    public static void main(String[] args) {
        System.out.println("sumUpTo0(10) = " + Arrays.toString(sumUpTo0(10)));
    }

}
