package nuray.Week4;

import java.util.Scanner;

public class removeDuplicates {

    public static String duplicatesRemoved(String str) {/*created a duplicates removed method that takes parameter
                                                    String str with a return type String*/


        String result = ""; /*declared variable 'result' and initialized it as an empty string with the purpose of
        storing the final result, once the duplicate characters are removed*/

        for (int i = 0; i < str.length(); i++) { /*used loop to iterate through each character of the input str:
                                                initializing at 0 and incrementing by 1 until the length of the string
                                                is reached*/
            char each = str.charAt(i);/*used str.charAt(i) to get to the current index i and stored in the variable
                                        'each'*/
            boolean isDuplicate = false;/*initialized the isDuplicate variable as false to track whether the character is
                                        duplicate or not*/

            for (int j = 0; j < result.length(); j++) {/*used nested loop to iterate through the characters in the
                                                        'result' string*/
                if (result.charAt(j) == each) { /*loop checked if the character 'each' is  in the 'result' string*/
                    isDuplicate = true;/*isDuplicate set to true if there is a duplicate*/
                    break;// inner loop terminate if there is a duplicate. Otherwise, isDuplicate remains false

                }
            }
            if (!isDuplicate) {/*checked the value of the isDuplicate. if false, this means 'each' is not a duplicate
                                and the character is appended to the result string via the =+ operator. This will
                                continue until all characters are processed */
                result += each;
            }
        }

        return result;// result string contains all the characters after duplicates are removed and returned by the method

    }

    public static void main(String[] args) {
        System.out.println(duplicatesRemoved("NNNNuuurrrayyy"));
    }
}




/*Write a return method that can remove the duplicated values from String
  Ex: removeDup("AAABBBCCC") ==> ABC*/




