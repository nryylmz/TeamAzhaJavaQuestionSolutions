package nuray.week11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfChar {

        public static void printCharacterFrequency(String input) {

            Map<Character, Integer> frequencyMap = new LinkedHashMap<>();/*using LinkedHashMap will allow us to store
                                                    the characters in the order of appearance. */

            for (String each : input.split("")) {/*using the split method will convert the string into
                                                        arrays of individual characters (to convert it to the Collections,
                                                        and for each loop will iterate over characters in that array and
                                                        calculate their frequencies*/
                int frequency = Collections.frequency(Arrays.asList(input.split("")), each); /* using
                                                            Collections.Frequency() with calculate the frequencies
                                                            and using the Arrays.AsList() will convert the String Array
                                                            into the List to be converted to a Collection type.*/
                frequencyMap.put(each.charAt(0), frequency);/*using the put() will add the characters and their
                                                            frequencies as a pair into the frequencyMap
                                                            each (character)= key, frequency= value*/
            }


            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {/*using for loop to iterate through
                                                            each kay-value entry in the frequencyMap */
                System.out.println(entry.getKey() + " -> " + entry.getValue()); /*printing the characters and their
                                                                      frequency in the Key(character) -> value (frequency)*/
            }
        }

        public static void main(String[] args) {
            printCharacterFrequency("Hello World");//using example from the assignment task
        }

    }

/*Map - Frequency of Characters
  Write a method that prints the frequency of each character from a String.
  Ex: Input => "Hello World"
      Output => Map
                H -> 1
                e -> 1
                l -> 3
                o -> 2
                W -> 1
                d -> 1
                */