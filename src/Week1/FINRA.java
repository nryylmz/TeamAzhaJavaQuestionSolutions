package Week1;

public class FINRA {
    public static void main(String[] args) {
        printNumbers();
    }
    public static void printNumbers() {
        for (int num = 1; num <= 30; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA");
            } else if (num % 3 == 0) {
                System.out.println("FIN");
            } else if (num % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(num);
            }
            //test
        }
    }

}
