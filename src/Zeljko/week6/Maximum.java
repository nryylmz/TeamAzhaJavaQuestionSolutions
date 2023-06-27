package Zeljko.week6;

public class Maximum {

  public static int max(int[] arr){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if(arr[i] > max){
              max = arr[i];
          }
      }
      return max;
  }

    public static void main(String[] args) {
      int[]numbers = {5,23,33,2,1,};
        System.out.println(max(numbers));
    }
}
