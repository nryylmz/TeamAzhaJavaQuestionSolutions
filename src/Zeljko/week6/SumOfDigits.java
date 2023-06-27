package Zeljko.week6;

public class SumOfDigits {
    public static int sum(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String input = "a3zz5m1";
        System.out.println(sum(input));
    }
}
