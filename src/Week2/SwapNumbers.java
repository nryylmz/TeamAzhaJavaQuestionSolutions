package Week2;

public class SwapNumbers {

    public static void swap(int num1, int num2) {

        num1 = num1 + num2;

        num2 = num1 - num2;

        num1 = num1 - num2;

        System.out.println("Num1 is turned to " + num1);
        System.out.println("Num2 is turned to " + num2);

    }
}
