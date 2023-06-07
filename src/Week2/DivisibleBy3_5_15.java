package Week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
         String divisibleBy15 ="";
         String divisibleBy3 ="";
         String divisibleBy5 ="";

        for (int i = 1; i <= 100; i++) {
            if( i % 15 == 0){
                divisibleBy15 += i + " ";
            }
            if( i % 3 == 0 && i % 15 != 0 ){
                divisibleBy3 += i + " ";
            }
            if( i % 5 == 0 && i % 15 != 0){
                divisibleBy5 += i + " ";
            }
        }
        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 3: " + divisibleBy3);
        System.out.println("Divisible by 5: " + divisibleBy5);

    }

}
