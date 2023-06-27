package Mohamed.Week6;
import java.util.Scanner;
public class FindMaximum {
    public static int findMax(int[] array) {
        int max = array[0];// assuming the max is the array at index 0
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter  number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = findMax(array);
        System.out.println("The maximum number is: " + max);
    }
}

