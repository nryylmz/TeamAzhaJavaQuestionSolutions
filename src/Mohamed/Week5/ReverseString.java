package Mohamed.Week5;
import java.util.Scanner;
public class ReverseString {
    //This program lets us enter a string.
    // It then takes the input and reverses the order of the letters.
    // Finally, it shows us the reversed version of the input on the screen.
    // The program does this by using  StringBuilder that helps manipulate strings easily.
    // sb is my input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a your string here : ");
        String str = input.nextLine();
        System.out.println("The reversed string is: " + reverseString(str));
    }
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}