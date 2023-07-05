package nuray.Week7;
                                                /*Write a method that can find the minimum number from an int Array

                                                    - To answer, I need to use for-each loop because I need to iterate
                                                    an array of integers to compare each element to the current minimum,
                                                    and update that minimum every time a smaller value is found */

public class findMinimum {
    public static int findMin(int[] arr1) {/*created a custom method 'findMin' with an int return type that takes
                                            an array of integers as input*/
        int min = arr1[0];/*initialized variable 'min' with the first element of 'arr1' array, assuming that the first
                            element is the minimum in the array*/
        for (int each : arr1) {/*used for each loop to iterate through the elements to check if the first element is
                                really the minimum int*/
            if (each < min) {/*comparing the elements with the current value of min. if the current value of each is
                               smaller than the current value of min, then:*/
                min = each;/* 'min' variable gets updated with the value of 'each'*/
            }
        }
        return min; /*after iterating through the elements, return statement is used to return 'min'*/
    }
}
