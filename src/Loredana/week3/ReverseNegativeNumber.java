package Loredana.week3;

import java.util.Scanner;

public class ReverseNegativeNumber
{
    public static int reverseNumber(int n)
    {
        int reverse = 0;

            while (n!=0)
            {
                reverse = reverse*10 + n%10;
                n/=10;
                
            }
        return reverse;
    }
    public static void main(String[] args)
    {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a negative number");
        do{
            n = input.nextInt();
            if(n >= 0)
            {
                System.out.println("The number entered is not valid. Please enter a negative number:");
            }
        }while (n>=0);

        System.out.println("The reverse number of " + n + " is: " + reverseNumber(n));

        /*
        2. Reverse negative number
  Write a return method that can reverse negative number and return it as int.
  For example, N = -215:
  OutPut: -512
         */
    }
}
