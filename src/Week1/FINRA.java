package Week1;

public class FINRA {

    public static void main(String[] args) {
        // Print the numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            // Check if the number is a multiple of 3
            if (i % 3 == 0) {
                System.out.println("FIN");
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("RA");
            }
            // Check if the number is a multiple of both 3 and 5
            else if (i % 15 == 0) {
                System.out.println("FINRA");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }
}
