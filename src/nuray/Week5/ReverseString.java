package nuray.Week5;

import java.util.Scanner;

public class ReverseString {

    public static String reversingString() {//defined reversingString method with a String return type
        Scanner input = new Scanner(System.in);// initialized a new instance of the Scanner class named "input"
        System.out.println("Enter a text here: ");//prompted the user to enter a text (to reverse) on the console
        String text = input.nextLine();/*read the text/word of input from the user using the Scanner object named "input"
                                        and assigned it to the variable "text" of type String.*/
        input.close();//closed the Scanner for the "input" object to avoid  using unnecessary memory

        String reversedString = "";//created variable reversedString to store the reversed string from the variable text

        for (int i = text.length() - 1; i >= 0; i--) {/* used for-loop to iterate through the text in reverse order. Since
                                      the index of the last character in a string will be one less than  the length of
                                       the string, I initialized the loop from text.length()-1 to get the last character.
                                       I set the condition to 0 keep iterating until the index 0, i.e., the first
                                       character, and decremented the value of i by 1 in each iteration of the loop. */
            reversedString += text.charAt(i);/*appended the characters from variable text to variable reversedString in
                                            each iteration of the loop via the addition assignment operator.*/

        }
        return reversedString;//returned reversedString for the method reversingString.
    }

    public static void main(String[] args) {
        System.out.println(reversingString()); /*used the main() to call the reversingString() method and print the
                                                 reversed string to the console. */
    }
}
/*Write a return method that can reverse String.
        Ex: Reverse("ABCD"); ==> DCBA*/