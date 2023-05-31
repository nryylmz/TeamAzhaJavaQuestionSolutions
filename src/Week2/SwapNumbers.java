package Week2;

import java.util.Scanner;

public class SwapNumbers
{
    /*
    1. Swap Numbers
  Swap two variable' values without using a third variable.'
     */
    public static void swap(int num1, int num2)
    {
        num1 -= num2;
        num2 += num1;
        num1 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number num1 = ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number num2 = ");
        int num2 = input.nextInt();
        swap(num1, num2);


    }
}
