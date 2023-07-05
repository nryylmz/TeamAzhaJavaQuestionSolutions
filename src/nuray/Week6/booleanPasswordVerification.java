package nuray.Week6;

public class booleanPasswordVerification {
    public static boolean passwordVerification(String password) {
        if (password.length()<6||password.contains(" ")) {
            return false;
        }if (!password.contains("A-Z")){
            return false;
        }if (!password.contains("a-z")){
            return false;
        }if (!password.contains(("!@#$%^&*({)]}["))){
            return false;
        }boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }
return true;
    }


    public static void main(String[] args) {
        String testingValidPassword="!Cydeo12";
        String testingInvalidPassword="Cydeo";
        System.out.println(passwordVerification(testingInvalidPassword));
        System.out.println(passwordVerification(testingInvalidPassword));
    }
}