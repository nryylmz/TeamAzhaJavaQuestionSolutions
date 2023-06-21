package nuray.Week5;

import java.util.Scanner;

public class uniqueCharacters {
    public static String findUniqueChars() {//defined findUniqueChars method with a String return type
        Scanner scan= new Scanner(System.in); // initialized a new instance of the Scanner class named "scan"
        System.out.println("Enter your characters: ");//prompted the user to enter their characters on the console
        String str=scan.nextLine();//Scanner read the line of input and store into the variable 'str'
        scan.close();//closed the Scanner object to avoid using unnecessary memory.


        for (int i = 0; i < str.length(); i++) {/*used to the outer loop to iterate over each character of the input string str
                                                using the loop variable i.*/
            int uniqueChar = 0;//initialized uniqueChar to 0 and used to determine if the current character is unique.
            for (int j = 0; j < str.length(); j++) {/*used the inner loop to compare the character at index i with
                                                    every other character in the string, using the loop variable j.*/

                if (str.charAt(i) == str.charAt(j) && i != j) {/*created if statement to check for match. If match is
                                                                found and i and j are not equal, this meant the
                                                                character not unique. */
                    uniqueChar = 1;/* in the event match is found, value 1 gets added to the uniqueChar variable and
                                    terminate the loop via the break statement because no need to continue iterating
                                    through the remaining characters since the uniqueness of the current character has been determined.*/
                    break;
                }
            }
            if (uniqueChar == 0)/*Once the inner loop finished for a specific character at index I, the code checked if
                                    uniqueChar still 0. Still 0 indicate the character is unique at which it is printed.
                                    Once the inner loop finished for a specific character at index I, the code checked
                                    if uniqueChar still 0. Still 0 indicate the character is unique at which it is
                                    printed.*/
                System.out.print(str.charAt(i));
        }
        return str;//returned the original input string str from the method findUniqueChars().
    }

    public static void main(String[] args) {
        findUniqueChars(); // called findUniqueChars() in the main method to execute the code.
    }
}



/*Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";*/