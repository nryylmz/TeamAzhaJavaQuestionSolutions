package Week1;

public class FINRA {

    public static void main(String[] args) {


        int num = 30;

        if(num % 3 == 0 && num % 5 == 0){ // if num divisible by 3 and 5 == 0
            System.out.println("FINRA"); // then should print FINRA
        } else if (num % 3 == 0 ) { // if the num divisible by 3 == 0
            System.out.println("FIN"); // then should print FIN
        }else if(num % 5 == 0){ // if the num divisible by 5 == 0
            System.out.println("RA"); // then should print RA
        }else{
            System.out.println(num); // if the condition is not divisible by 3 and 5 then it should print 30.
        }

    }


}


/*
3. FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN"
instead of numbers for multiples of 3, "RA" instead of numbers for numbers that are multiples of 5,
and a multiple of both 3 and 5 for "FINRA" instead of the number.

 */