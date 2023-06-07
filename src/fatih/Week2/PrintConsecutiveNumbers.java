package fatih.Week2;

public class PrintConsecutiveNumbers {

    public static void solution1(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                result += "CodilityTestCoders\n";
            else if (i % 2 == 0 && i % 3 == 0)
                result += "CodilityTest\n";
            else if (i % 2 == 0 && i % 5 == 0)
                result += "CodilityCoders\n";
            else if (i % 3 == 0 && i % 5 == 0)
                result += "TestCoders\n";
            else if (i % 2 == 0)
                result += "Codility\n";
            else if (i % 5 == 0)
                result += "Coders\n";
            else if (i % 3 == 0)
                result += "Test\n";
            else
                result += i + "\n";
        }

        System.out.println(result);

    }

    public static void solution2(int n) {
        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 2 == 0)
                result += "Codility";
            if (i % 3 == 0)
                result += "Test";
            if (i % 5 == 0)
                result += "Coders";
            if (result.isEmpty())
                System.out.print(i);

            System.out.println(result);
        }
    }

}
