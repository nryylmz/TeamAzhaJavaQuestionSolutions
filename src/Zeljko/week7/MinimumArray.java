package Zeljko.week7;

public class MinimumArray {
    public static int findMinimum(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {2,4,23,6};
        System.out.println(findMinimum(numbers));
    }
}
