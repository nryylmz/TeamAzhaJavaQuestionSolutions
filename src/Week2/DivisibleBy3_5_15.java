package Week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        System.out.print("Divisible By 15: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }


}
