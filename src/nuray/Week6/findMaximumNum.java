package nuray.Week6;

public class findMaximumNum {
    public static int maxValue(int[] num) {
        int max = num[0]; // Initialized with the assumption that the first element is the maximum number in the array

        for (int each : num) {
            // Checking each element to find the maximum number
            if (each > max) {//checks if the current element 'each' is greater than the current element 'max'
                max = each; // Update the max variable if a larger number is found
            }
        }

        return max; // Return the maximum number
    }

    public static int minValue(int[] num) {
        int min = num[0]; // Initialized with the assumption that the first element is the minimum number in the array

        for (int each : num) {
            // Checking each element to find the minimum number
            if (each < min) {
                min = each; // Update the min variable if a smaller number is found
            }
        }

        return min; // Return the minimum number
    }
}
