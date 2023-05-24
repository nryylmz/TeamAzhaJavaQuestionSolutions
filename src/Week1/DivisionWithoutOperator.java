
package Week1;

public class DivisionWithoutOperator {

    public static int divide(int num1, int num2){

        int result = 0;

        for(int i = 0; i <= num1; i++){
            if( i * Math.abs(num2) == Math.abs(num1)){
                result = i;
            }

            if((num1<0 && num2>0) || (num1>0 && num2 <0 )){
                result -= (result*2);
            }
        }
        return result;
    }

}
