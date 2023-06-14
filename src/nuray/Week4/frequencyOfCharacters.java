package nuray.Week4;

public class frequencyOfCharacters {
    public static String frequencyOfChars(String str) {/*created the frequencyOfChars method with parameter String str
                                                        and String return type*/
        String result = "";/*declared variable 'result' and initialized it as an empty string with the purpose of
        storing the final result of the characters and their frequencies*/
        for (int i = 0; i < str.length(); i++) {/*used loop to iterate over the characters in the string 'str'.
                                Initialized the variable 'i' to 0 and set the condition to keep run the loop until 'i'
                                becomes less than the length of the string, and incrementing after each iteration*/
            char charToCheck = str.charAt(i);/* retrieve the character from the current index of 'i' from the string
                            'str' via the charAt(). This will assign the character to the charToCheck variable*/
            int count = 1;//the initial count of the charToCheck.

            for (int j = i + 1; j < str.length(); j++) {/* Used nested loop to iterate the characters in the string 'str'
                                            starting from the next index after the charToCheck. Initialized variable 'j'
                                             'i +1' and set the loop to run until 'j' is less than the length of the string.*/

                if (str.charAt(j) == charToCheck) {/*checked if the character in the current index 'j' is equal to
                                                    charToCheck, which we got from the outer loop. If they are the same,
                                                    the character is repeated*/
                    count++;// if repeated, count variable increments
                }
            }
            if (!result.contains(charToCheck + "")) {/*if the result does not contain charToCheck with an empty string
                                                    (empty string will allow to convert it to a String). if the character
                                                     is not in the result, that means it is a new character and so it's
                                                     frequency append to the result string*/
                result += charToCheck + "" + count;
            }
        }

        return result;// return the result string with the characters and their frequencies
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("ERTYUIOERTYHJKL"));
    }
        }



/*Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/