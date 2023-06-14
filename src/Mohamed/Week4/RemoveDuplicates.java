package Mohamed.Week4;
import java.util.Scanner;
public class RemoveDuplicates {
    public static String removeDup(String str)
    //method responsible for removing duplicate characters from the input string.
    {
        StringBuilder sb = new StringBuilder();
        //declares and initializes a mutable string container called sb using the StringBuilder class.
        for (int i = 0; i < str.length(); i++) {
            if (!sb.toString().contains(str.charAt(i) + ""))
            //checks if the character at index i in the string str is not present in the string wasb.
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: "); //reading input from the user.
        String str = sc.nextLine();
        System.out.println("The String after removing duplicates is: " + removeDup(str));
    }
}
