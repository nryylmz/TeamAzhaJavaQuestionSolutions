package nuray.Week3;

public class ReverseNegativeNumber {
    public static int reverseNegativeNum(int number) {/*defined reverseNegativeNum method with integer 'number' as the
                                                        input parameter and returns an int value*/
        boolean isNegative = number < 0 ? true : false; /* using ternary, declared a boolean variable 'isNegative'
                                        to check if the 'number' is negative. If so, it will be assigned to the true
                                        value. otherwise, false.*/
        if (isNegative) {
            number = number * -1; /* using if statement to check if the above condition is true. If it is, will multiply
                                    'number' by -1 to convert it into a positive number*/
        }
        int reverse = 0;//declared int variable 'reverse' and initialized 0 to store the reverse number later.
        int lastDigit = 0;/*declared int variable 'lastDigit' and initialized 0 to store the last digit of the number
                            during the reversal.*/
        while (number >= 1) {/*using while loop for the reversal process for as long as the 'number' remains greater
                            than 1*/
            lastDigit = number % 10;/*calculating the remainder of 'number' divided by 10, and then assign it to the
                                    variable lastDigit in order to extract the last digit of the 'number'*/
            reverse = reverse * 10 + lastDigit;/*to shift the #s to the left, updating the 'reverse' variable by
                                                multiplying it by 10 and then adding the 'lastDigit' to the furthest
                                                right. Doing this will build the reversed number*/
            number = number / 10;/*to remove the last number, dividing 'number' by 10.*/

            //when the loop becomes less than 1, process ends.
        }
        return isNegative ? -reverse : reverse;/*using ternary to check if the original number was negative. If true,
                                                the reversed number to be made negative. If false, the reversed number
                                                remains as it is...a positive*/
    }

    public static void main(String[] args) {
        int number = -125;           //used the value in the task example for the 'number' variable.
        int reversedNumber = reverseNegativeNum(number);// calling on the 'reverseNegativeNum' method to pass the 'number'
        System.out.println(number + " is reversed to " + reversedNumber);
        //printing the original 'number' is reversed to the 'reversedNumber'

    }               /**/
}






/*Reverse negative number
  Write a return method that can reverse negative number and return it as int.
  For example, N = -215:
  OutPut: -512*/