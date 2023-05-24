package Week1;

public class FINRA {
    public static void main(String[] args) {
        for (int i = 1; i <=30 ; i++) {    /*Printing numbers 1-30. Initialization is set to 1, condition to 30,
                                incrementing after each iteration to eventually make the condition false.*/

            /*Using multi-branch if statements to check the given conditions and modify the
            prints in accordance with the prompt. Using multi-branch because, in addition to printing 1-30,
            we are also checking for multiple related conditions */

            if(i % 3==0 && i % 5== 0){ /* Order matters, therefore need to begin checking the condition for the numbers
                                        that are multiples of both 3 and 5, otherwise we can't find the numbers to
                                        substitute FINRA*/
                System.out.println("FINRA");//if true, those numbers will be replaced with "FINRA"
            }else if(i % 3==0){ //checking for numbers that are multiples of 3.
                System.out.println("FIN"); //if true, those numbers will be replaced with "FIN"
            }else if (i % 5==0){// checking for the numbers that are multiples of 5.
                System.out.println("Ra"); //if true, those numbers will be replaced with "RA"
            }else{
                System.out.println(i);// printing the numbers that are not effected by the 3 conditions, as normal.
            }
                                    /*used the modulus operator to determine if a number is  multiple of 3, 5, or both
                                    * because any number that is evenly divisible by another is therefore a multiple of
                                    * it*/
        }
    }
    }
/*FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3, "RA"
instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for "FINRA" instead of the
number.*/