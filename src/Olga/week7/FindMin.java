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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("findMin(arr) = " + findMin(arr));
    }

}
