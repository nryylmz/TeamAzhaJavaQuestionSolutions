package Marsela2;

import java.util.ArrayList;

public class Divisibleby {
    public static void main(String[] args) {

        //create three integer arrays
        ArrayList<Integer> divisibleby15 = new ArrayList<>();
        ArrayList<Integer> divisibleby5 = new ArrayList<>();
        ArrayList<Integer> divisibleby3 = new ArrayList<>();

        //use for loop and condition to iterate over each number as specified in the condition
        for (int i = 1; i <= 100; i++) {
            if( i % 15 == 0){
                divisibleby15.add(i);
            }

            if( i % 5 == 0){
                divisibleby5.add(i);
            }

            if( i % 3 == 0){
                divisibleby3.add(i);
            }
        }

        System.out.println("Divisible By 15: " + divisibleby15);
        System.out.println("Divisible By 5: " + divisibleby5);
        System.out.println("Divisible By 3: " + divisibleby3);

    }
}
/*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
  - if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section,'
  - if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section,'
  - if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section,'
EX:
  OutPut:
    Divisible By 15 : 15 30 45 60 75 90
    Divisible By 5 : 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    Divisible By 3 : 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */

