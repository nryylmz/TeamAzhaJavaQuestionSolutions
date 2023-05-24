package Week1;
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner is a variable
        //Scanner is a class in Java that allows you to read input.
        //System.in is an input stream that represents the standard input
        System.out.print("Enter a number here: ");
        int number = scanner.nextInt();
        //allows you to read user input from the console.
        //int number: declare a number (integer) as variable
        //nextInt() : It returns the obtained integer value.

        if (number % 2 == 0) {
            System.out.println(number + " is a even number.");
        } else {
            System.out.println(number + " is a odd number .");
            }
        }


}
