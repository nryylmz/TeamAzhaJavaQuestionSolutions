package Week1;

import java.util.Scanner;

public class oddOrEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = input.nextInt();


        if (number % 2 == 0) {
            System.out.println("identity" + "(" + number + ")" + "->" + " Odd");
        } else {
            System.out.println("identity" + "(" + number + ")" + "->" + " Even");
        }


    }
}






/*
1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"
 */





