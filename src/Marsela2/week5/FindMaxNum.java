package Marsela2.week5;

import java.util.Scanner;

public class FindMaxNum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;  // we assign the smallest int value

        for(int i = 0; i <5; i++ ){
            System.out.println("Enter a number: ");
            int num = input.nextInt();  // suppose user entered 10, 5, 3, 20, 15


            if(num > max){        //  if the user enters a number greater than the current max number
                max = num;       // then that number entered by user becomes the max number
            }

        }

        System.out.println("max = " + max);


    }

}

 //   Find Maximum:
   //     Write a method that can find the maximum number from an int Array.