package Olga.week7;

public class FindMin {

    public static int findMin(int[] arr){

        int min = arr[0];

        for(int each : arr){
            if(min>each){
                min=each;
            }
        }
        return min;
    }

}
