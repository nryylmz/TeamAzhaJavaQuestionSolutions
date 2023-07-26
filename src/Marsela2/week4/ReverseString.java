package Marsela2.week4;

public class ReverseString {

    public static void main(String[] args) {
        String str = "ABCDBHIOHGDFS";
        String reverse = " ";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);            //(str.charAt(i)); --> print in reverse
        }

//str.length() - 1 gives us the last char of the string , we are going backwards
        System.out.println(reverse);


    }

}

/*
Write a return method that can reverse String.
  Ex: Reverse("ABCD"); ==> DCBA
 */

