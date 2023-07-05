package Mohamed.week7;
import java.util.Scanner;
public class SortAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }

        arr1 = sortAscending(arr1);

        System.out.println("The array sorted in ascending order is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }

        scanner.close();
    }

    public static int[] sortAscending(int[] arr1) {
        int n = arr1.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    // Swap arr1[j] and arr1[j+1]
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        return arr1;
    }

}
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//  Ex: int[] arr = {10, 9, 8, 7};
//  arr = Sort(arr); ==>{ 7, 8, 9, 10};