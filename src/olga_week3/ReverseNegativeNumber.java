package olga_week3;

public class ReverseNegativeNumber {

    public static int reverseNegNum(int num){
        if(num>0){
            throw new IllegalArgumentException("Invalud input: number must be negative");
        }

        int result = 0;
        String resultStr = "-";

        String str = String.valueOf(num);

        for(int i = str.length()-1; i>=1; i--){

            resultStr += ""+str.charAt(i);

        }
        result = Integer.parseInt(resultStr);

        return result;

    }

    public static void main(String[] args) {
        System.out.println("reverseNegNum(-512) = " + reverseNegNum(-512));
    }
}
