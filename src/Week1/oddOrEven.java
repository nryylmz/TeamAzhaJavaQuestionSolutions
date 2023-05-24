package Week1;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = input.nextInt();

        if(isEven(number)){
            System.out.println(number + " is even number. ");
        }else{
            System.out.println(number + " is odd number. ");
        }


    }
    public static boolean isEven(int number){
        return number % 2 == 0;

    }
}
