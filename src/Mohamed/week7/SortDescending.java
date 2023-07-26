package Mohamed.week7;
import java.util.Scanner;
public class SortDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        arr = sortDescending(arr);

        System.out.println("The array sorted in descending order is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    public static int[] sortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}
/*
 Write a return method SortDescending in java.
 that can sort an int array in descending order without using the sort method of the Arrays class.
 Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */