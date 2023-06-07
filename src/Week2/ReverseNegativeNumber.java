package Week2;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int num = -3604;
        int reverseNum = 0;
        while (num != 0){
            int digit = num % 10;  //gets last digit 4
            reverseNum = reverseNum * 10 + digit; // multiply reverseNum by 10, and add the digit value to it(to shift digits to the left)

            num/=10; //remove the last digit we just added
        }
        if(reverseNum < 0){    // after while loop is finished , we check if reverseNum is negative , if yes - we reverse the sign to positive
            reverseNum = -reverseNum;
        }

        System.out.println("reverseNum = " + reverseNum);  //
            
        }

    }


/*
Reverse negative number
  Write a return method that can reverse negative number and return it as int.
  For example, N = -215:
  OutPut: -512
 */