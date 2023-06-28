package Marsela2.week5;

public class SumOfDigitsInString {

    public static int sumOfDigits(String s) {
        int total = 0;
        char[] ch = s.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each)) {
                total += Integer.valueOf("" + each);
            }
        }
        return total;
    }


}

/*
Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
 */