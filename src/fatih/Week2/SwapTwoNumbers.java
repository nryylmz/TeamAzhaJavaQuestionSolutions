package fatih.Week2;

public class SwapTwoNumbers {

    public static void swap2NumbersSolution1() {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

    }

    public static void swap2NumbersSolution2() {

        /*
        The bitwise & operator performs a bitwise AND operation.

        The bitwise ^ operator performs a bitwise exclusive OR operation.

        The bitwise | operator performs a bitwise inclusive OR operation.
         */

        int a = 10; //  1010
        int b = 20; // 10100
        a = a ^ b;  // 11110
        b = a ^ b;  // 01010
        a = a ^ b;  // 10100
    }
}
