package Zeljko.week6;

public class Password {
    public static boolean passwordValidation(String password){
        if(password == null || password.length() < 6 || password.contains(" ") ) {
            return false;
        }
            boolean hasUpperCase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;


        for (char c : password.toCharArray()) {
            if(Character.isUpperCase(c)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(c)){
                hasLowercase = true;
            }else if(Character.isDigit(c)){
                hasDigit = true;
            }else{
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("Zeljko@123"));
    }
}
