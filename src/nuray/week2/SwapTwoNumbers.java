package nuray.week2;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num = 345, num1 = 567;//declared two int variables 'num' and 'num1' with values 345 and 567, respectively

        num = num + num1;//used arithmetic operator '+' to add the values of num and num1 and assigned to num
        //num= 345+567; The value of num variable becomes 912.
        num1 = num - num1;// used arithmetic operator ' - ' to subtract the value of num1 from num & assigned to num1
        // num1= 912-567; The value of num1 changes from 567 to 345.
        num = num - num1;//used arithmetic operator - to subtract the value of num from num1 and assigned to back to num
        // num= 912-345; The value of the num variable changes again, but this time to the value of 567.


        System.out.println("num = " + num);  //printing the  swapped values
        System.out.println("num1 = " + num1);


    }
}



