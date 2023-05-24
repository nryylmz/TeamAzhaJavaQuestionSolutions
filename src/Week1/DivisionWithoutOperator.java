package Week1;

public class DivisionWithoutOperator {
    public static void main(String[] args) {


    int num= 0, num1=250, num2= 50;// created three int variables and initialized their values.

    while (num1>=num2){//created while-loop to execute the code block for as long as num1 is greater than num2.
        num1-=num2;/*set the condition to reduce num1 by num2 via the compound assignment operator & stored the
                    result back to num1*/
        num++;/*num was initialized at zero and incremented by 1 during each iteration to keep track of the number of
                times the loop was executed*/
    }
        System.out.println(num);//printing num to get the result of the execution.

        /*The value of incremented num variable should be the same as the result of dividing 250 by 50
        using the division operator, which is 5. */
}}


/* Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator Numbers - - Divide without / operator*/
