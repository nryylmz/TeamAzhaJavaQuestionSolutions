package Olga.week5;

public class Reverse {

    public static String reverse(String str){

        StringBuilder result = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        str = result.toString();
        return str;
    }

    public static void main(String[] args) {
        System.out.println("reverse(\"JAVA\") = " + reverse("JAVA"));
    }
}
