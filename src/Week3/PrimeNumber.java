package Week3;

public class PrimeNumber {


            public static boolean isPrime(int number) {
                if (number <= 1) {
                    return false; // Numbers less than or equal to 1 are not prime
                }

                // Check if the number is divisible by any number from 2 to half of the number
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        return false; // Number is divisible by 'i', so it's not prime
                    }
                }

                return true; // Number is prime
            }

            public static void main(String[] args) {
                int number = 17; // Example number to check

                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        }





/*Prime Number
        Prime Number is a whole number greater than 1 that cannot be exactly divided by
         any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11,..).
        Write a method that can check if a number is prime or not.

 */

