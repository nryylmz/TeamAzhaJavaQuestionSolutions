package Week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        String divisibleBy15 = ""; /*Created 3 String variables, named them according to the sections specified
                                    on the task, and initialized them as empty strings in order to store the numbers
                                     that are divisible by 15, 5, and 3, respectively*/
        String divisibleBy5 = "";
        String divisibleBy3 = "";


        for (int i = 1; i <= 100; i++) {/* created a loop to print the numbers 1 through 100 with a post-increment
                                        to make the code false after reaching 100*/

                                /*created a multi-branch if statement to check for numbers that are divisible by 15,
                                5, and 3*/
            if (i % 15 == 0) {
                divisibleBy15 += i + " "; /*used the compound operator to concatenate the existing value
                                            of the divisibleBy15 variable with the value of 'i'*/
            } else if (i % 5 == 0 && i % 15 != 0) { /*checking for numbers that are divisible by 5 but not 15 by using
                                                    the != operator */
                divisibleBy5 += i + " ";// appending the same way as the first condition.
            } else if (i % 3 == 0 && i % 15 != 0) {/*checking for numbers that are divisible by 3 but not 15 same way as
                                                    I did previously*/
                divisibleBy3 += i + " ";// appending the same way as before
            }

        }

        System.out.println("Divisible By 15: " + divisibleBy15);
                                                                /* printing by concatenating the 'sections' with the
                                                                variables that now have values stored in them */
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);

    }
}
