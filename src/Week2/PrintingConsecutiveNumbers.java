package Week2;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintingConsecutiveNumbers {

   public static void consecutiveNums(int n) {

       for (int i = 1; i <= n; i++) {
           if( i % (2*3*5) == 0 ){
               System.out.println("CodilityTestCoders");
           }else if( i % (2*3) == 0 ) {
               System.out.println("CodilityTest");
           }else if( i % (2*5) == 0) {
               System.out.println("CodilityCoders");
           }else if ( i % (3*5) == 0 ) {
               System.out.println("TestCoders");
           }else if( i % 2 == 0 ) {
               System.out.println("Codility");
           }else if( i % 3 == 0 ) {
               System.out.println("Test");
           }else if( i % 5 == 0 ) {
               System.out.println("Coders");
           }else{
               System.out.println(i);
           }

       }

   }

    public static void main(String[] args) {
        consecutiveNums(65);
    }

}
