package nuray.Week4;

public class sameLetters {

    public static boolean isSameLetters(String str, String str1) {/*created a isSameLetters method that takes two string
                                        parameters (str and str1), and returns a boolean value*/
        if (str.length() != str1.length()) { /*created an if statement to check the length of the values in the variables */

            return false;/*if the lengths of the two inputs are not the same, method will return false because that would
                           mean the strings do not have the same letters*/
        }

        for (int i = 0; i <= str.length()-1; i++) { /*Using loop to iterate each of the characters in String str, starting
                                            from index zero bc that is the first character. Loop will continue until the
                                            last character, which is str.length()-1*/
            char ch = str.charAt(i);/* each character extracted by the loop will be assigned to the variable ch.*/

            if (str1.indexOf(ch) == -1) {/*checking if a particular character in the variable ch from string str is not
                                        in string str1*/
                return false;// if not, the two strings do not have the same letters, and the method will return false
            }
            str1 = str1.replaceFirst(String.valueOf(ch), "");/*replacing the first occurrence of the variable
                                        ch from str to eliminate a matched character. This way, the loop will not
                                         consider the same character twice.*/
        }

        return str1.isEmpty();/*using isEmpty() to check if all the characters in the original string str have been
                            checked and removed*/
    }

    public static void main(String[] args) {
        System.out.println(isSameLetters("abc","cba"));
        System.out.println(isSameLetters("abc", "abb"));
    }
}