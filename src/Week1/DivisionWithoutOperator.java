package Week1;

import java.util.Scanner;

public class DivisionWithoutOperator {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in); // the given input is as follows;
        System.out.println("enter your first number: ");
        int a = input.nextInt();
        System.out.println("enter your second number: ");
        int b = input.nextInt();

        int count = 0;

        while (a >= b){ // while a is greater or equal than the b
            a = a-b; // then a - b
            count = count+1; // decrements by 1
        }
        System.out.println("Divide is: " + count);

    }
}
