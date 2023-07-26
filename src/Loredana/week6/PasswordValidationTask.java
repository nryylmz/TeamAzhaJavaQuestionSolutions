package Loredana.week6;

import java.util.Collections;
import java.util.Scanner;

public class PasswordValidationTask
{
    public static boolean passwordValidation(String password)
    {
        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpecialCharacter = false;
        boolean isDigit = false;
        boolean result = false;

        //verify if the password contains any spaces and the length is more than 6;
        if(!password.contains(" ") && password.length()>=6)
        {
            for (int i = 0; i < password.length(); i++)
            {
                //verify if the character is letter
                if(Character.isLetter(password.charAt(i)))
                {
                    //verify if the character is upper case
                    String letter = password.charAt(i)+"";
                    if(letter.equals(letter.toUpperCase()))
                    {
                        isUpper = true;
                    }
                    else
                    {//the character is lowercase
                        isLower = true;
                    }
                }
                else
                    //verify if the character is digit
                    if(Character.isDigit(password.charAt(i)))
                    {
                        isDigit = true;
                    }
                    else
                    {
                        //if the character is not digit or letter then it's special character
                        isSpecialCharacter = true;
                    }
                if(isUpper && isLower && isDigit && isSpecialCharacter)
                {
                    result = true;
                    break;
                }

            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password");
        String password = input.nextLine();

        System.out.println(passwordValidation(password));

    }
    /*
    1. Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
  5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
     */
}
