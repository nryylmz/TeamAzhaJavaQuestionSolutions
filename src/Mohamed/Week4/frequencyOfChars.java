package Mohamed.Week4;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class frequencyOfChars {
    public static String getFrequency(String str) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        }
        StringBuilder builder = new StringBuilder();
        for (Character ch : frequencies.keySet()) {
            builder.append(ch).append(" ").append(frequencies.get(ch));
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(getFrequency(str));
    }

}
