package Olga.week6;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Arrays;

public class SumOfDigits {

    public static int sumOfDigits(String digits) {

        char[] arrChar = digits.toCharArray();
        int result = 0;

        for (char each : arrChar) {
            if (Character.isDigit(each)) {
                int num = Character.getNumericValue(each);
                result += num;
            }
        }
        return result;
    }


}
