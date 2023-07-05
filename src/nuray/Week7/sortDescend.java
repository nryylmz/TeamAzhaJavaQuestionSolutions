package nuray.Week7;

public class sortDescend {
    public static int[] sortDescend(int[] arr) {/*return method with int return type.Takes an array of integers*/

        for (int i = 0; i < arr.length - 1; i++) { /*nested for-loop. The outer loop is initialized
                                                at zero to act as a counter after each iteration. The condition is
                                                arr.length -1*/
            for (int j = 0; j < arr.length - i - 1; j++) {/*inner loop to iterate over the unsorted portion
                                                            'i' is subtracted in the condition to avoid comparing the
                                                            already-sorted elements in the successive iteration*/
                if (arr[j] < arr[j + 1]) {/*checked if the current element is less than the next element i.e., wrong order.*/
                    int num1 = arr[j];/*if order is wrong, current value of arr[i] stored in the temp. variable num1 for the swap*/
                    arr[j] = arr[j + 1];/*assigned the value of the next element to the current element*/
                    arr[j + 1] = num1;/*assigning the value in the temp.variable num1 to the next element to create a
                                        movement to keep moving the larger elements towards the end after each pass*/
                }

            }
        }
        return arr;
    }
}