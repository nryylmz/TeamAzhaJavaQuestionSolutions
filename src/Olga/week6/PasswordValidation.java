package Olga.week6;

public class PasswordValidation {

    public static boolean passwordIsValid(String password){

        //1
        if(password.length()<6){
            return false;
        }

        //2
        if(password.contains(" ")){
            return false;
        }

        boolean hasLowerCase = false, hasUpperCase = false, hasDigit = false;
        //3,4,5
        for(char ch : password.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
               hasLowerCase = true;
            }
        }

        for(char ch : password.toCharArray()){
            if(ch>='A' && ch<= 'Z'){
                hasUpperCase = true;
            }
        }

        for(char ch : password.toCharArray()){
            if(ch>='0' && ch<='9'){
                hasDigit = true;
            }
        }

        if(hasLowerCase==false || hasUpperCase == false || hasDigit == false){
            return false;
        }

        return true;

    }

}
