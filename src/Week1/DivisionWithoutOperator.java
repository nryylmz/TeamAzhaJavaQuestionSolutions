package Week1;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 3;
        int num3 =0;
        while(num1>=num2){
            num1-=num2;
            num3++;
        }
        System.out.println(num3);
    }


}
