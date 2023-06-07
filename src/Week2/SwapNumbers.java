package Week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b; //25
        b = a - b; //10
        a = a - b; //15

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
