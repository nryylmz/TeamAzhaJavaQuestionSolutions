package Week1;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); /*Declared a Scanner variable 'input' and created a new instance of the
                                                   Scanner class to read from the console*/
        System.out.println("Enter a number: ");/* Prompting the user to enter a # by displaying the message "Enter
                                                   a number: " on the console*/
        int num = input.nextInt();//Want the user input to be an int value and store that value in the 'num' variable


        if (num % 2 != 0) {//checks if the remainder of the given # divided by 2 does not equal to zero.
            System.out.println(num+ " is odd"); /*if the remainder does not ==
                                                        zero, system will print "(number) is odd" on the console*/

        }else{//the remainder of the # divided by 2 is zero.
            System.out.println(num+ " is even");/*if the remainder does == zero, system will print "(number) is even" on
                                                   the console*/
        }

    }
}
/* Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"
*/