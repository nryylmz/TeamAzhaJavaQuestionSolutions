package fatih.Week5;

public class ReverseString {

    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String Reverse1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return reverse;
    }

    public static String Reverse2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
