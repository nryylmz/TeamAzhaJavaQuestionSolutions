package nuray.Week6;

public class SumOfStringDigits {
    public static int sumOfDigits(String s) {//decleared sumOfDigits that takes a String parameter s and returns an integer.
        int total = 0;// declared an int variable total;initializes it to 0...to store the sum of the digits.
        char[] ch = s.toCharArray();// converted the input string s into a character array ch to split the string into individual characters.
        for (char each : ch) {//for-each loop that iterate over each character each in the character array ch.
            if (Character.isDigit(each)) {//checked if the current character each is a digit via Character.isDigit() method.
                                                // returns true if the character is a digit.
                total += Integer.valueOf("" + each); /*If above condition is true, this line converts the character to
                                                          its corresponding int value via Integer.valueOf().
                                                          The character is first concatenated with an empty string ("")
                                                          to convert it to a string before converting it to an int.
                                                          The resulting int value is added to the total variable.*/
            }
        }
        return total;//after loop finished executing, 'total' is returned.
    }

}
}
