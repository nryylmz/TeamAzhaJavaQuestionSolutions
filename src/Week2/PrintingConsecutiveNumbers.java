package Week2;


public class PrintingConsecutiveNumbers {
    public static void printingConsecutiveNumbers(int N) {//created a method with 'int N' parameter

        for (int i = 1; i <= N; i++) {//created for loop to iterate numbers 1-N; initialized 1 and conditioned to N

                if( i % 2==0 && i % 3==0 && i % 5==0 ){//If i is divisible by 2, 3, and 5
                    System.out.println("CodilityTestCoders"); /*the statement will print the concatenation of the
                                                                respective words Codility, Test & Coders */
                }else if( i % 2 == 0 && i % 3==0 ) {// Else if i is divisible by both 2 and 3
                    System.out.println("CodilityTest");// 'CodilityTest' will be printed.
                }else if( i % 2 == 0 && i % 5==0) {//Else if i is divisible by both 2 and 5
                    System.out.println("CodilityCoders");// 'CodilityCoders' will be printed
                }else if ( i % 3==0 && i% 5== 0 ) {//Else if i is divisible by both 3 and 5
                    System.out.println("TestCoders");//'CodilityCoders' will be printed
                }else if( i % 2 == 0 ) {//Else if i is divisible by 2
                    System.out.println("Codility");//'Codility' will be printed
                }else if( i % 3 == 0 ) {//Else if i is divisible by 3
                    System.out.println("Test");//Test will be printed
                }else if( i % 5 == 0 ) {//Else if i is divisible by 5
                    System.out.println("Coders");//'Coders' will be printed
                }else{//Else none of the conditions are met
                    System.out.println(i);//the value of 'i' will be printed
                }

            }
        }

        public static void main(String[] args) {//executed the method using the example given in the task.
        int N = 17;
        printingConsecutiveNumbers(N);
    }
}






