package Zeljko.week8;

import java.util.Arrays;

public class ArrayMoveZeros {
    public static int[] moveZeros(int[] arr){
        int[] result = new int[arr.length];

        for (int i = 0, j = 0; i < arr.length ; i++) {
            if(arr[i]!=0){
                result[j++]=arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,1,0,5,0,1,0};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }
}
