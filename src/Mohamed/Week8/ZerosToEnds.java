package Mohamed.Week8;
import java.util.Arrays;
import java.util.Scanner;
public class ZerosToEnds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        moveZeroes(arr);
        System.out.println("The array after moving all the zeros to last indexes: ");
        System.out.println(Arrays.toString(arr));
    }
    private static void moveZeroes(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { //if the e
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
