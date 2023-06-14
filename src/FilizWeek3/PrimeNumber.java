package FilizWeek3;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println( findPrimes(1,100) );
    }

    public static ArrayList<Integer> findPrimes(int start, int end) {

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int n = start; n < end; n++) {

            boolean prime = true;

            int i = 2;
            while(i  <= n/ 2){

                if(n % i == 0 ){

                    prime = false;
                    break;
                }
                i++;


            }
           if(prime){
               primes.add(n);
           }

        }



    return primes;
    }


}




/*
Dear friends <@&1050512057746870339>
Here is your **Java Coding Tasks for the 3. week**.

```cs
1. Prime Number
  PrimeNumber is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11,..).
  Write a method that can check if a number is prime or not.

 */