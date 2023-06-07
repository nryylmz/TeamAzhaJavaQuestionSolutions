package fatih.Week2;

import java.util.ArrayList;
import java.util.List;

public class DivisibleBy3515 {

    public static void solution1() {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int each : arr) {
            if (each % 15 == 0)
                divisibleBy15 += each + " ";
            if (each % 5 == 0 && each % 15 != 0)
                divisibleBy5 += each + " ";
            if (each % 3 == 0 && each % 15 != 0)
                divisibleBy3 += each + " ";
        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);

    }

    public static void solution2() {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++)
            list.add(i + 1);

        System.out.print("Divisible By 15: ");
        list.forEach(p -> {
            if (p % 15 == 0) System.out.print(p + " ");
        });

        System.out.print("\nDivisible By 5: ");
        list.forEach(p -> {
            if (p % 5 == 0 && p % 15 != 0) System.out.print(p + " ");
        });

        System.out.print("\nDivisible By 3: ");
        list.forEach(p -> {
            if (p % 3 == 0 && p % 15 != 0) System.out.print(p + " ");
        });


    }
}
