package Marsela2.week5;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNum {

    public static int maxValue1(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each > max)
                max = each;

        return max;
    }

    public static int maxValue2(int[] n) {
        Arrays.sort(n);
        return n[n.length - 1];
    }


    }



 //   Find Maximum:
   //     Write a method that can find the maximum number from an int Array.