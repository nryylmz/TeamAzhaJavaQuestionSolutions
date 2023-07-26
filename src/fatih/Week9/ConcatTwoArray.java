package fatih.Week9;

public class ConcatTwoArray {
    /*
        Write a return method that can concate two arrays.
     */
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i] = each;
            i++;
        }
        for (int each : arr2) {
            result[i] = each;
            i++;
        }
        return result;
    }

}
