package Mohamed.Week4;
import java.util.Scanner;
public class StringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String s2 = scanner.nextLine();
        boolean same = same(s1, s2);
        System.out.println("Are the strings built out of the same letters? " + same);
    }
    public static boolean same(String s1, String s2) {
        if (s1.length() != s2.length()) {//The method first checks if the lengths of s1 and s2 are different.
            return false;
            // If they are, it means the strings cannot be built out of the same letters, so the method returns false.
        }
        //If the lengths are the same,the method proceeds to iterate over each character (c) in the s1 string
        // checks if s2 contains that character.
        for (char c : s1.toCharArray())
        //iterate each character C in the string s1 by converting it to a character array using toCharArray().
        {
            if (!s2.contains(String.valueOf(c)))
            //check if the character c is NOT present in the string s2.
            {
                return false;
                //If a character in s1 is not found in s2, it means the strings have different letters,
                // and the method returns false.
            }
        }
        return true;
        //If the method completes the loop without finding any mismatched characters,
        // it means all the letters in s1 are present in s2, and the method returns true.
    }
}


// It does this by converting the character c to a string using String.valueOf(c) and calling s2.contains() method.





