package Week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 200;

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Swapped numbers:"
                + " number1 = " + number1 + ", number2 = " + number2);

    }
}
/*
Swap Numbers
  Swap two variable values without using a third variable.
 */

