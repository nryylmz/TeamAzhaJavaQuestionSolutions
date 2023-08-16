package Zeljko.week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayN {
    public static int[] generateArray(int N){
        List<Integer> nums = new ArrayList<>();
        for (int i = -(N/2); i <= N/2; i ++){
            nums.add(i);
        }
        Collections.shuffle(nums);
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = nums.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = generateArray(N);
        for (int num : arr) {
            System.out.println(num + " ");
        }

        }
    }

