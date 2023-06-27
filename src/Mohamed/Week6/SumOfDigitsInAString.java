package Mohamed.Week6;
import java.util.Scanner;
public class SumOfDigitsInAString {
    public static int sumOfDigits(String str) {// declare a string str
        int sum = 0;//declaration and initialization a sum to zero
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - '0'; //The -'0' operator is used to convert a character to its numeric value.

            }
        }
        return sum;
    }

    //The sumOfDigits() method takes a string as input and returns the sum of the digits in the string.
    // The method works by first initializing a variable called sum to 0.
   // Then, it iterates through the string and checks each character.
    // If the character is a digit, then the method adds the value of the character to sum.
  // Finally, the method returns sum.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        int sum = sumOfDigits(str);
        System.out.println("The sum of the digits in the string is: " + sum);
    }
}



