package nuray.Week3;

public class PrimeNumber {
    public static boolean isPrime(int number){/*defined the isPrime method with a parameter of int number and boolean
                                                return type*/
        if(number<=1){ //checking if the number is less than or equal to 1
            return false;// if it is, then the number is not a prime number and will immediately return 'false.'
        }
        for (int i = 2; i <number; i++) {/*for numbers greater than 1, using for-loop  to check if they are evenly
                                        divisible, iterating from 2 */
            if(number % i==0){/*if the 'number' is  divisible by current value of 'i' without a remainder, is not a
                                prime number*/
                return false;//if the above condition is true, return type will be false to signify it is not a prime #
            }}
        return true;/* if for-loop doesn't find any divisors before completion, then that indicates the number is a
                            prime number and will return 'true.'*/
    }



    public static void main(String[] args) {
        System.out.println(isPrime(523));           //c alling the main method to pass the argument '523'
    }
}

