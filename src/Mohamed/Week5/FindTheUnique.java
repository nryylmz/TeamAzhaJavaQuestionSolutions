package Mohamed.Week5;
import java.util.Scanner;
public class FindTheUnique {
    public static void main(String[] args) {
        //  It asks the user for input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input here:");
        //The input string is read using scan.nextLine() and stored in the variable 'input'.
        String input = scanner.nextLine();

        //  iterates over each character.
        for (int i = 0; i < input.length(); i++) {
            boolean isUnique = true;
            //  checks for uniqueness.
            for (int j = 0; j < input.length(); j++) {
                //  checks for uniqueness.
                if ((i != j ) && (input.charAt(i) == input.charAt(j))) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                //  and prints the unique characters.
                System.out.print(input.charAt(i));
                //After the inner loop for character at index i,
                // if uniqueChar is 0, the character is unique and printed.
            }
        }
        scanner.close();
    }
}
