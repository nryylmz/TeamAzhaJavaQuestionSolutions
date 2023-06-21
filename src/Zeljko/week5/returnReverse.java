package Zeljko.week5;

import javax.management.MBeanAttributeInfo;

public class returnReverse {
    public static void main(String[] args) {
        System.out.println(reverseStr("ABCD"));
    }




    public static String reverseStr(String str ){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }

     return reverse;
    }
}
