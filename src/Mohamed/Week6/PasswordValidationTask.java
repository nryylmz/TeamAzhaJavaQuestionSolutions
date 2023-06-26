package Mohamed.Week6;
import java.util.Scanner;
public class PasswordValidationTask {
    public static boolean isValidPassword(String password) {
        // Check password length and  no space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        // Check for at least one uppercase letter
        //declaration and initialization of a boolean variable named hasUppercase with the value false.
        boolean hasUppercase = false;
        // Check for at least one lowercase letter
        boolean hasLowercase = false;
        // Check for at least one special character
        boolean hasSpecialChar = false;
        // Check for at least one digit
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        // Check if all conditions are met , if yes return True
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password here : ");
        String password = scanner.nextLine();

        boolean isValid = isValidPassword(password);
        System.out.println("Your password is valid?  The Answer is " + isValid);
        scanner.close();
    }
}
