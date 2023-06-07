package Zeljko.Week03;

public class ReverseNegative {
    public static void main(String[] args) {
        int result = reverseInt(-1234);
        System.out.println(result);
    }
    public static int reverseInt(int num){
        boolean isNegative = num<0 ? true : false;
        if(isNegative){
            num =num*-1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (num!=0){
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;

        }
        return isNegative == true ? reverse * -1 : reverse;
    }
}
